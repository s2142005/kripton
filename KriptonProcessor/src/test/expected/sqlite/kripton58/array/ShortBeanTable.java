package sqlite.kripton58.array;

import java.lang.String;

/**
 * <p>
 * Entity <code>ShortBean</code> is associated to table <code>short_bean</code>
 * This class represents table associated to entity.
 * </p>
 *  @see ShortBean
 */
public class ShortBeanTable {
  /**
   * Costant represents name of table short_bean
   */
  public static final String TABLE_NAME = "short_bean";

  /**
   * <p>
   * DDL to create table short_bean
   * </p>
   *
   * <pre>CREATE TABLE short_bean (id INTEGER PRIMARY KEY AUTOINCREMENT, value BLOB, value2 BLOB);</pre>
   */
  public static final String CREATE_TABLE_SQL = "CREATE TABLE short_bean (id INTEGER PRIMARY KEY AUTOINCREMENT, value BLOB, value2 BLOB);";

  /**
   * <p>
   * DDL to drop table short_bean
   * </p>
   *
   * <pre>DROP TABLE IF EXISTS short_bean;</pre>
   */
  public static final String DROP_TABLE_SQL = "DROP TABLE IF EXISTS short_bean;";

  /**
   * Entity's property <code>id</code> is associated to table column <code>id</code>. This costant represents column name.
   *
   *  @see ShortBean#id
   */
  public static final String COLUMN_ID = "id";

  /**
   * Entity's property <code>value</code> is associated to table column <code>value</code>. This costant represents column name.
   *
   *  @see ShortBean#value
   */
  public static final String COLUMN_VALUE = "value";

  /**
   * Entity's property <code>value2</code> is associated to table column <code>value2</code>. This costant represents column name.
   *
   *  @see ShortBean#value2
   */
  public static final String COLUMN_VALUE2 = "value2";
}
