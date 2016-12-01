package sqlite.kripton63;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.abubusoft.kripton.android.KriptonLibrary;
import com.abubusoft.kripton.android.sharedprefs.AbstractSharedPreference;
import com.abubusoft.kripton.common.ProcessorHelper;
import com.abubusoft.kripton.processor.utils.StringUtility;
import java.lang.Byte;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;

/**
 * This class is the shared preference binder defined for Bean63
 *
 * @see Bean63
 */
public class BindBean63SharedPreferences extends AbstractSharedPreference {
  /**
   * instance of shared preferences
   */
  private static BindBean63SharedPreferences instance;

  /**
   * working instance of bean
   */
  private final Bean63 defaultBean;

  /**
   * constructor
   */
  private BindBean63SharedPreferences() {
    // no name specified, using default shared preferences
    prefs=PreferenceManager.getDefaultSharedPreferences(KriptonLibrary.context());
    defaultBean=new Bean63();
  }

  /**
   * create an editor to modify shared preferences
   */
  public BindEditor edit() {
    return new BindEditor();
  }

  /**
   * reset shared preferences
   */
  public void reset() {
    Bean63 bean=new Bean63();
    write(bean);
  }

  /**
   * read bean entirely
   *
   * @return read bean
   */
  public Bean63 read() {
    Bean63 bean=new Bean63();
    bean.id=prefs.getLong("id", bean.id);
    bean.value=prefs.getString("value", bean.value);
     {
      String temp=prefs.getString("valueMapStringByte", null);
      bean.valueMapStringByte=(StringUtility.hasText(temp)) ? ProcessorHelper.asMap(new HashMap<String, Byte>(), String.class, Byte.class, temp): null;}

     {
      String temp=prefs.getString("valueMapEnumByte", null);
      bean.valueMapEnumByte=(StringUtility.hasText(temp)) ? ProcessorHelper.asMap(new HashMap<EnumType, Byte>(), EnumType.class, Byte.class, temp): null;}


    return bean;
  }

  /**
   * write bean entirely
   *
   * @param bean bean to entirely write
   */
  public void write(Bean63 bean) {
    SharedPreferences.Editor editor=prefs.edit();
    editor.putLong("id",bean.id);
    editor.putString("value",bean.value);
    if (bean.valueMapStringByte!=null) editor.putString("valueMapStringByte",ProcessorHelper.asString(bean.valueMapStringByte)); else editor.putString("valueMapStringByte", null);
    if (bean.valueMapEnumByte!=null) editor.putString("valueMapEnumByte",ProcessorHelper.asString(bean.valueMapEnumByte)); else editor.putString("valueMapEnumByte", null);

    editor.commit();
  }

  /**
   * read property id
   *
   * @return property id value
   */
  public long id() {
    return prefs.getLong("id", defaultBean.id);
  }

  /**
   * read property value
   *
   * @return property value value
   */
  public String value() {
    return prefs.getString("value", defaultBean.value);
  }

  /**
   * read property valueMapStringByte
   *
   * @return property valueMapStringByte value
   */
  public Map<String, Byte> valueMapStringByte() {
    String temp=prefs.getString("valueMapStringByte", null);
    return (StringUtility.hasText(temp)) ? ProcessorHelper.asMap(new HashMap<String, Byte>(), String.class, Byte.class, temp): null;
  }

  /**
   * read property valueMapEnumByte
   *
   * @return property valueMapEnumByte value
   */
  public HashMap<EnumType, Byte> valueMapEnumByte() {
    String temp=prefs.getString("valueMapEnumByte", null);
    return (StringUtility.hasText(temp)) ? ProcessorHelper.asMap(new HashMap<EnumType, Byte>(), EnumType.class, Byte.class, temp): null;
  }

  /**
   * get instance of shared preferences
   */
  public static BindBean63SharedPreferences instance() {
    if (instance==null) {
      instance=new BindBean63SharedPreferences();
    }
    return instance;
  }

  /**
   * editor class for shared preferences
   */
  public class BindEditor extends AbstractEditor {
    private BindEditor() {
    }

    /**
     * modifier for property id
     */
    public BindEditor putId(long value) {
      editor.putLong("id",value);
      return this;
    }

    /**
     * modifier for property value
     */
    public BindEditor putValue(String value) {
      editor.putString("value",value);
      return this;
    }

    /**
     * modifier for property valueMapStringByte
     */
    public BindEditor putValueMapStringByte(Map<String, Byte> value) {
      if (value!=null) editor.putString("valueMapStringByte",ProcessorHelper.asString(value)); else editor.putString("valueMapStringByte", null);
      return this;
    }

    /**
     * modifier for property valueMapEnumByte
     */
    public BindEditor putValueMapEnumByte(HashMap<EnumType, Byte> value) {
      if (value!=null) editor.putString("valueMapEnumByte",ProcessorHelper.asString(value)); else editor.putString("valueMapEnumByte", null);
      return this;
    }
  }
}
