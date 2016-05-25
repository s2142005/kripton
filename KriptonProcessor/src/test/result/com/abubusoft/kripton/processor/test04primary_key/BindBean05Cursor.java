package com.abubusoft.kripton.processor.test04primary_key;

import android.database.Cursor;
import com.abubusoft.kripton.common.DateUtil;
import java.util.LinkedList;

/**
 * Generated by Kripton Library.
 *
 *  @since Wed May 25 23:31:52 CEST 2016
 *
 */
public class BindBean05Cursor {
  protected Cursor cursor;

  /**
   * Index for column "pk"
   */
  protected int index0;

  /**
   * Index for column "text"
   */
  protected int index1;

  /**
   * Index for column "content"
   */
  protected int index2;

  /**
   * Index for column "creationTime"
   */
  protected int index3;

  BindBean05Cursor(Cursor cursor) {
    wrap(cursor);
  }

  public BindBean05Cursor wrap(Cursor cursor) {
    this.cursor=cursor;

    index0=cursor.getColumnIndex("pk");
    index1=cursor.getColumnIndex("text");
    index2=cursor.getColumnIndex("content");
    index3=cursor.getColumnIndex("creation_time");

    return this;
  }

  public LinkedList<Bean05> execute() {

    LinkedList<Bean05> resultList=new LinkedList<Bean05>();
    Bean05 resultBean=new Bean05();

    if (cursor.moveToFirst()) {
      do
       {
        resultBean=new Bean05();

        if (index0>=0 && !cursor.isNull(index0)) { resultBean.setPk(cursor.getLong(index0));}
        if (index1>=0 && !cursor.isNull(index1)) { resultBean.setText(cursor.getString(index1));}
        if (index2>=0 && !cursor.isNull(index2)) { resultBean.setContent(cursor.getBlob(index2));}
        if (index3>=0 && !cursor.isNull(index3)) { resultBean.setCreationTime(DateUtil.read(cursor.getString(index3)));}

        resultList.add(resultBean);
      } while (cursor.moveToNext());
    }
    cursor.close();

    return resultList;
  }

  public void executeListener(OnBean05Listener listener) {
    Bean05 resultBean=new Bean05();

    if (cursor.moveToFirst()) {
      do
       {
        if (index0>=0) { resultBean.setPk(0L);}
        if (index1>=0) { resultBean.setText(null);}
        if (index2>=0) { resultBean.setContent(null);}
        if (index3>=0) { resultBean.setCreationTime(null);}

        if (index0>=0 && !cursor.isNull(index0)) { resultBean.setPk(cursor.getLong(index0));}
        if (index1>=0 && !cursor.isNull(index1)) { resultBean.setText(cursor.getString(index1));}
        if (index2>=0 && !cursor.isNull(index2)) { resultBean.setContent(cursor.getBlob(index2));}
        if (index3>=0 && !cursor.isNull(index3)) { resultBean.setCreationTime(DateUtil.read(cursor.getString(index3)));}

        listener.onRow(resultBean, cursor.getPosition(),cursor.getCount());
      } while (cursor.moveToNext());
    }
    cursor.close();
  }

  public static BindBean05Cursor create(Cursor cursor) {
    return new BindBean05Cursor(cursor);
  }

  /**
   * Listener for row read from database.
   *
   * @param bean bean read from database. Only selected columns/fields are valorized.
   * @param rowPosition position of row.
   * @param rowCount total number of rows.
   *
   */
  public interface OnBean05Listener {
    void onRow(Bean05 bean, int rowPosition, int rowCount);
  }
}
