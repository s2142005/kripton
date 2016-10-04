package com.abubusoft.kripton.processor.kripton48.entities;

import android.database.Cursor;
import java.util.LinkedList;

/**
 * Generated by Kripton Library.
 *
 */
public class BindBean02Cursor {
  protected Cursor cursor;

  /**
   * Index for column "id"
   */
  protected int index0;

  /**
   * Index for column "text"
   */
  protected int index1;

  BindBean02Cursor(Cursor cursor) {
    wrap(cursor);
  }

  public BindBean02Cursor wrap(Cursor cursor) {
    this.cursor=cursor;

    index0=cursor.getColumnIndex("id");
    index1=cursor.getColumnIndex("text");

    return this;
  }

  public LinkedList<Bean02> execute() {

    LinkedList<Bean02> resultList=new LinkedList<Bean02>();
    Bean02 resultBean=new Bean02();

    if (cursor.moveToFirst()) {
      do
       {
        resultBean=new Bean02();

        if (index0>=0 && !cursor.isNull(index0)) { resultBean.setId(cursor.getLong(index0));}
        if (index1>=0 && !cursor.isNull(index1)) { resultBean.setText(cursor.getString(index1));}

        resultList.add(resultBean);
      } while (cursor.moveToNext());
    }
    cursor.close();

    return resultList;
  }

  public void executeListener(OnBean02Listener listener) {
    Bean02 resultBean=new Bean02();

    if (cursor.moveToFirst()) {
      do
       {
        if (index0>=0) { resultBean.setId(0L);}
        if (index1>=0) { resultBean.setText(null);}

        if (index0>=0 && !cursor.isNull(index0)) { resultBean.setId(cursor.getLong(index0));}
        if (index1>=0 && !cursor.isNull(index1)) { resultBean.setText(cursor.getString(index1));}

        listener.onRow(resultBean, cursor.getPosition(),cursor.getCount());
      } while (cursor.moveToNext());
    }
    cursor.close();
  }

  public static BindBean02Cursor create(Cursor cursor) {
    return new BindBean02Cursor(cursor);
  }

  /**
   * Listener for row read from database.
   *
   * @param bean bean read from database. Only selected columns/fields are valorized.
   * @param rowPosition position of row.
   * @param rowCount total number of rows.
   *
   */
  public interface OnBean02Listener {
    void onRow(Bean02 bean, int rowPosition, int rowCount);
  }
}
