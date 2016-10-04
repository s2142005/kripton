package com.abubusoft.kripton.processor.kripton48.persistence;

import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import java.lang.Override;

/**
 * Generated by Kripton Library.
 *
 */
public abstract class BindDummy01AsyncTask<I, U, R> {
  /**
   * If <code>true</code> indicates database operations are only read operations
   *
   */
  protected boolean readOnlyTask;

  /**
   * Async task wrapped by this class
   *
   */
  protected AsyncTask<I, U, R> asyncTask;

  public BindDummy01AsyncTask() {
    this(true);}

  public BindDummy01AsyncTask(boolean readOnlyTask) {
    this.readOnlyTask = readOnlyTask;}

  /**
   * Use this method for operations on UI-thread before start execution
   */
  public void onPreExecute() {
  }

  /**
   * Method used to encapsulate operations on datasource
   *
   * @param daoFactory
   * 	dao factory. Use it to retrieve DAO
   * @return
   * 	result of operation (list, bean, etc)
   */
  public abstract R onExecute(BindDummy01DaoFactory daoFactory);

  /**
   * Use this method for operations on UI-thread after execution
   */
  public abstract void onFinish(R result);

  /**
   * Override this method to display operation progress on UI-Thred
   */
  public void onProgressUpdate(R result) {
  }

  /**
   * Method to start operations.
   *
   * @param
   * 	data input
   */
  public void execute(I... params) {
    asyncTask=new AsyncTask<I, U, R>() {
      @Override
      public void onPreExecute() {
        BindDummy01AsyncTask.this.onPreExecute();
      }

      @Override
      public R doInBackground(I... params) {
        R result=null;
        BindDummy01DataSource dataSource=BindDummy01DataSource.instance();
        SQLiteDatabase sqlite=readOnlyTask ? dataSource.getReadableDatabase() : dataSource.getWritableDatabase();
        try {
          result=onExecute(dataSource);
        } catch(Exception e) {
        } finally {
          if (sqlite!=null && sqlite.isOpen()) {
            dataSource.close();
          }
        }
        return null;
      }

      @Override
      public void onProgressUpdate(U... values) {
        onProgressUpdate(values);
      }

      @Override
      public void onPostExecute(R result) {
        BindDummy01AsyncTask.this.onFinish(result);
      }
    };
    asyncTask.execute(params);
  }

  /**
   * Simple implementation of asynctask. Used to only read from database and use data when finish to read from datasource
   */
  public abstract static class Simple<R> extends BindDummy01AsyncTask<Void, Void, R> {
  }
}
