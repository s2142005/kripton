package kripton70;

import com.abubusoft.kripton.android.annotation.BindMap;
import com.abubusoft.kripton.binder2.context.JacksonContext;
import com.abubusoft.kripton.binder2.context.XmlBinderContext;
import com.abubusoft.kripton.binder2.core.AbstractMapper;
import com.abubusoft.kripton.binder2.persistence.JacksonWrapperParser;
import com.abubusoft.kripton.binder2.persistence.JacksonWrapperSerializer;
import com.abubusoft.kripton.binder2.persistence.XmlWrapperParser;
import com.abubusoft.kripton.binder2.persistence.XmlWrapperSerializer;
import com.abubusoft.kripton.common.CalendarUtil;
import com.abubusoft.kripton.common.CurrencyUtil;
import com.abubusoft.kripton.common.DateUtil;
import com.abubusoft.kripton.common.LocaleUtil;
import com.abubusoft.kripton.common.TimeUtil;
import com.abubusoft.kripton.common.TimeZoneUtil;
import com.abubusoft.kripton.common.UrlUtil;
import com.abubusoft.kripton.escape.StringEscapeUtils;
import com.abubusoft.kripton.exception.KriptonRuntimeException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.lang.Override;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Stack;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;
import org.codehaus.stax2.XMLStreamReader2;
import org.codehaus.stax2.XMLStreamWriter2;

/**
 * This class is the shared preference binder defined for BeanElement70
 *
 * @see BeanElement70
 */
@BindMap
public class BeanElement70BindMap extends AbstractMapper<BeanElement70> {
  /**
   * create new object instance
   */
  @Override
  public BeanElement70 createInstance() {
    return new BeanElement70();
  }

  /**
   * reset shared preferences
   */
  @Override
  public void serializeOnJackson(JacksonContext context, BeanElement70 object, JacksonWrapperSerializer wrapper) {
    try {
      JsonGenerator jacksonSerializer = wrapper.jacksonGenerator;
      jacksonSerializer.writeStartObject();

      // Serialized Field:

      // field valueBean
      if (object.valueBean!=null)  {
        jacksonSerializer.writeFieldName("valueBean");
        context.mapperFor(BeanElement70.class).serializeOnJackson(context, object.valueBean, wrapper);
      }

      // field valueBigDecimal
      if (object.valueBigDecimal!=null)  {
        jacksonSerializer.writeStringField("valueBigDecimal", object.valueBigDecimal.toPlainString());
      }

      // field valueBigInteger
      if (object.valueBigInteger!=null)  {
        jacksonSerializer.writeStringField("valueBigInteger", object.valueBigInteger.toString());
      }

      // field valueBool
      if (object.valueBool!=null)  {
        jacksonSerializer.writeBooleanField("valueBool", object.valueBool);
      }

      // field valueBoolType
      jacksonSerializer.writeBooleanField("valueBoolType", object.valueBoolType);

      // field valueByte
      if (object.valueByte!=null)  {
        jacksonSerializer.writeNumberField("valueByte", object.valueByte);
      }

      // field valueByteType
      jacksonSerializer.writeNumberField("valueByteType", object.valueByteType);

      // field valueCalendar
      if (object.valueCalendar!=null)  {
        jacksonSerializer.writeStringField("valueCalendar", CalendarUtil.write(object.valueCalendar));
      }

      // field valueChar
      if (object.valueChar!=null)  {
        jacksonSerializer.writeNumberField("valueChar", object.valueChar);
      }

      // field valueCharType
      jacksonSerializer.writeNumberField("valueCharType", object.valueCharType);

      // field valueContentBoolType
      if (object.valueContentBoolType!=null)  {
        jacksonSerializer.writeNumberField("valueContentBoolType", object.valueContentBoolType);
      }

      // field valueCurrency
      if (object.valueCurrency!=null)  {
        jacksonSerializer.writeStringField("valueCurrency", CurrencyUtil.write(object.valueCurrency));
      }

      // field valueDate
      if (object.valueDate!=null)  {
        jacksonSerializer.writeStringField("valueDate", DateUtil.write(object.valueDate));
      }

      // field valueDouble
      if (object.valueDouble!=null)  {
        jacksonSerializer.writeNumberField("valueDouble", object.valueDouble);
      }

      // field valueDoubleType
      jacksonSerializer.writeNumberField("valueDoubleType", object.valueDoubleType);

      // field valueEnum
      if (object.valueEnum!=null)  {
        jacksonSerializer.writeStringField("valueEnum", object.valueEnum.toString());
      }

      // field valueFloat
      if (object.valueFloat!=null)  {
        jacksonSerializer.writeNumberField("valueFloat", object.valueFloat);
      }

      // field valueFloatType
      jacksonSerializer.writeNumberField("valueFloatType", object.valueFloatType);

      // field valueInt
      if (object.valueInt!=null)  {
        jacksonSerializer.writeNumberField("valueInt", object.valueInt);
      }

      // field valueIntType
      jacksonSerializer.writeNumberField("valueIntType", object.valueIntType);

      // field valueLocale
      if (object.valueLocale!=null)  {
        jacksonSerializer.writeStringField("valueLocale", LocaleUtil.write(object.valueLocale));
      }

      // field valueLong
      if (object.valueLong!=null)  {
        jacksonSerializer.writeNumberField("valueLong", object.valueLong);
      }

      // field valueLongType
      jacksonSerializer.writeNumberField("valueLongType", object.valueLongType);

      // field valueShort
      if (object.valueShort!=null)  {
        jacksonSerializer.writeNumberField("valueShort", object.valueShort);
      }

      // field valueShortType
      jacksonSerializer.writeNumberField("valueShortType", object.valueShortType);

      // field valueString
      if (object.valueString!=null)  {
        jacksonSerializer.writeStringField("valueString", object.valueString);
      }

      // field valueTime
      if (object.valueTime!=null)  {
        jacksonSerializer.writeStringField("valueTime", TimeUtil.write(object.valueTime));
      }

      // field valueTimeZone
      if (object.valueTimeZone!=null)  {
        jacksonSerializer.writeStringField("valueTimeZone", TimeZoneUtil.write(object.valueTimeZone));
      }

      // field valueUrl
      if (object.valueUrl!=null)  {
        jacksonSerializer.writeStringField("valueUrl", UrlUtil.write(object.valueUrl));
      }

      // field id
      jacksonSerializer.writeNumberField("id", object.getId());

      jacksonSerializer.writeEndObject();
    } catch(IOException e) {
      e.printStackTrace();
      throw (new KriptonRuntimeException(e));
    }
  }

  /**
   * reset shared preferences
   */
  @Override
  public void serializeOnJacksonAsString(JacksonContext context, BeanElement70 object, JacksonWrapperSerializer wrapper) {
    try {
      JsonGenerator jacksonSerializer = wrapper.jacksonGenerator;
      jacksonSerializer.writeStartObject();

      // Serialized Field:

      // field valueBean
      if (object.valueBean!=null)  {
        jacksonSerializer.writeFieldName("valueBean");
        context.mapperFor(BeanElement70.class).serializeOnJacksonAsString(context, object.valueBean, wrapper);
      }

      // field valueBigDecimal
      if (object.valueBigDecimal!=null)  {
        jacksonSerializer.writeStringField("valueBigDecimal", object.valueBigDecimal.toPlainString());
      }

      // field valueBigInteger
      if (object.valueBigInteger!=null)  {
        jacksonSerializer.writeStringField("valueBigInteger", object.valueBigInteger.toString());
      }

      // field valueBool
      if (object.valueBool!=null)  {
        jacksonSerializer.writeStringField("valueBool", String.valueOf(object.valueBool));
      }

      // field valueBoolType
      jacksonSerializer.writeStringField("valueBoolType", String.valueOf(object.valueBoolType));

      // field valueByte
      if (object.valueByte!=null)  {
        jacksonSerializer.writeStringField("valueByte", String.valueOf(object.valueByte));
      }

      // field valueByteType
      jacksonSerializer.writeStringField("valueByteType", String.valueOf(object.valueByteType));

      // field valueCalendar
      if (object.valueCalendar!=null)  {
        jacksonSerializer.writeStringField("valueCalendar", CalendarUtil.write(object.valueCalendar));
      }

      // field valueChar
      if (object.valueChar!=null)  {
        jacksonSerializer.writeStringField("valueChar", String.valueOf((int)object.valueChar));
      }

      // field valueCharType
      jacksonSerializer.writeStringField("valueCharType", String.valueOf((int)object.valueCharType));

      // field valueContentBoolType
      if (object.valueContentBoolType!=null)  {
        jacksonSerializer.writeStringField("valueContentBoolType", String.valueOf(object.valueContentBoolType));
      }

      // field valueCurrency
      if (object.valueCurrency!=null)  {
        jacksonSerializer.writeStringField("valueCurrency", CurrencyUtil.write(object.valueCurrency));
      }

      // field valueDate
      if (object.valueDate!=null)  {
        jacksonSerializer.writeStringField("valueDate", DateUtil.write(object.valueDate));
      }

      // field valueDouble
      if (object.valueDouble!=null)  {
        jacksonSerializer.writeStringField("valueDouble", String.valueOf(object.valueDouble));
      }

      // field valueDoubleType
      jacksonSerializer.writeStringField("valueDoubleType", String.valueOf(object.valueDoubleType));

      // field valueEnum
      if (object.valueEnum!=null)  {
        jacksonSerializer.writeStringField("valueEnum", object.valueEnum.toString());
      }

      // field valueFloat
      if (object.valueFloat!=null)  {
        jacksonSerializer.writeStringField("valueFloat", String.valueOf(object.valueFloat));
      }

      // field valueFloatType
      jacksonSerializer.writeStringField("valueFloatType", String.valueOf(object.valueFloatType));

      // field valueInt
      if (object.valueInt!=null)  {
        jacksonSerializer.writeStringField("valueInt", String.valueOf(object.valueInt));
      }

      // field valueIntType
      jacksonSerializer.writeStringField("valueIntType", String.valueOf(object.valueIntType));

      // field valueLocale
      if (object.valueLocale!=null)  {
        jacksonSerializer.writeStringField("valueLocale", LocaleUtil.write(object.valueLocale));
      }

      // field valueLong
      if (object.valueLong!=null)  {
        jacksonSerializer.writeStringField("valueLong", String.valueOf(object.valueLong));
      }

      // field valueLongType
      jacksonSerializer.writeStringField("valueLongType", String.valueOf(object.valueLongType));

      // field valueShort
      if (object.valueShort!=null)  {
        jacksonSerializer.writeStringField("valueShort", String.valueOf(object.valueShort));
      }

      // field valueShortType
      jacksonSerializer.writeStringField("valueShortType", String.valueOf(object.valueShortType));

      // field valueString
      if (object.valueString!=null)  {
        jacksonSerializer.writeStringField("valueString", object.valueString);
      }

      // field valueTime
      if (object.valueTime!=null)  {
        jacksonSerializer.writeStringField("valueTime", TimeUtil.write(object.valueTime));
      }

      // field valueTimeZone
      if (object.valueTimeZone!=null)  {
        jacksonSerializer.writeStringField("valueTimeZone", TimeZoneUtil.write(object.valueTimeZone));
      }

      // field valueUrl
      if (object.valueUrl!=null)  {
        jacksonSerializer.writeStringField("valueUrl", UrlUtil.write(object.valueUrl));
      }

      // field id
      jacksonSerializer.writeStringField("id", String.valueOf(object.getId()));

      jacksonSerializer.writeEndObject();
    } catch(IOException e) {
      e.printStackTrace();
      throw (new KriptonRuntimeException(e));
    }
  }

  /**
   * reset shared preferences
   */
  @Override
  public void serializeOnXml(XmlBinderContext context, BeanElement70 object, XmlWrapperSerializer wrapper, int currentEventType) {
    try {
      XMLStreamWriter2 xmlSerializer = wrapper.xmlSerializer;
      if (currentEventType == 0) {
        xmlSerializer.writeStartElement("root");
      }

      // Persisted fields:

      // field valueBean
      if (object.valueBean!=null)  {
        xmlSerializer.writeStartElement("valueBean");
        context.mapperFor(BeanElement70.class).serializeOnXml(context, object.valueBean, wrapper, 1);
        xmlSerializer.writeEndElement();
      }

      // field valueBigDecimal
      if (object.valueBigDecimal!=null)  {
        xmlSerializer.writeStartElement("valueBigDecimal");
        xmlSerializer.writeCharacters(StringEscapeUtils.escapeXml10(object.valueBigDecimal.toPlainString()));
        xmlSerializer.writeEndElement();
      }

      // field valueBigInteger
      if (object.valueBigInteger!=null)  {
        xmlSerializer.writeStartElement("valueBigInteger");
        xmlSerializer.writeCharacters(StringEscapeUtils.escapeXml10(object.valueBigInteger.toString()));
        xmlSerializer.writeEndElement();
      }

      // field valueBool
      if (object.valueBool!=null)  {
        xmlSerializer.writeStartElement("valueBool");
        xmlSerializer.writeBoolean(object.valueBool);
        xmlSerializer.writeEndElement();
      }

      // field valueBoolType
      xmlSerializer.writeStartElement("valueBoolType");
      xmlSerializer.writeBoolean(object.valueBoolType);
      xmlSerializer.writeEndElement();

      // field valueByte
      if (object.valueByte!=null)  {
        xmlSerializer.writeStartElement("valueByte");
        xmlSerializer.writeInt(object.valueByte);
        xmlSerializer.writeEndElement();
      }

      // field valueByteType
      xmlSerializer.writeStartElement("valueByteType");
      xmlSerializer.writeInt(object.valueByteType);
      xmlSerializer.writeEndElement();

      // field valueCalendar
      if (object.valueCalendar!=null)  {
        xmlSerializer.writeStartElement("valueCalendar");
        xmlSerializer.writeCharacters(StringEscapeUtils.escapeXml10(CalendarUtil.write(object.valueCalendar)));
        xmlSerializer.writeEndElement();
      }

      // field valueChar
      if (object.valueChar!=null)  {
        xmlSerializer.writeStartElement("valueChar");
        xmlSerializer.writeInt(object.valueChar);
        xmlSerializer.writeEndElement();
      }

      // field valueCharType
      xmlSerializer.writeStartElement("valueCharType");
      xmlSerializer.writeInt(object.valueCharType);
      xmlSerializer.writeEndElement();

      // field valueCurrency
      if (object.valueCurrency!=null)  {
        xmlSerializer.writeStartElement("valueCurrency");
        xmlSerializer.writeCharacters(StringEscapeUtils.escapeXml10(CurrencyUtil.write(object.valueCurrency)));
        xmlSerializer.writeEndElement();
      }

      // field valueDate
      if (object.valueDate!=null)  {
        xmlSerializer.writeStartElement("valueDate");
        xmlSerializer.writeCharacters(StringEscapeUtils.escapeXml10(DateUtil.write(object.valueDate)));
        xmlSerializer.writeEndElement();
      }

      // field valueDouble
      if (object.valueDouble!=null)  {
        xmlSerializer.writeStartElement("valueDouble");
        xmlSerializer.writeDouble(object.valueDouble);
        xmlSerializer.writeEndElement();
      }

      // field valueDoubleType
      xmlSerializer.writeStartElement("valueDoubleType");
      xmlSerializer.writeDouble(object.valueDoubleType);
      xmlSerializer.writeEndElement();

      // field valueEnum
      if (object.valueEnum!=null)  {
        xmlSerializer.writeStartElement("valueEnum");
        xmlSerializer.writeCharacters(StringEscapeUtils.escapeXml10(object.valueEnum.toString()));
        xmlSerializer.writeEndElement();
      }

      // field valueFloat
      if (object.valueFloat!=null)  {
        xmlSerializer.writeStartElement("valueFloat");
        xmlSerializer.writeFloat(object.valueFloat);
        xmlSerializer.writeEndElement();
      }

      // field valueFloatType
      xmlSerializer.writeStartElement("valueFloatType");
      xmlSerializer.writeFloat(object.valueFloatType);
      xmlSerializer.writeEndElement();

      // field valueInt
      if (object.valueInt!=null)  {
        xmlSerializer.writeStartElement("valueInt");
        xmlSerializer.writeInt(object.valueInt);
        xmlSerializer.writeEndElement();
      }

      // field valueIntType
      xmlSerializer.writeStartElement("valueIntType");
      xmlSerializer.writeInt(object.valueIntType);
      xmlSerializer.writeEndElement();

      // field valueLocale
      if (object.valueLocale!=null)  {
        xmlSerializer.writeStartElement("valueLocale");
        xmlSerializer.writeCharacters(StringEscapeUtils.escapeXml10(LocaleUtil.write(object.valueLocale)));
        xmlSerializer.writeEndElement();
      }

      // field valueLong
      if (object.valueLong!=null)  {
        xmlSerializer.writeStartElement("valueLong");
        xmlSerializer.writeLong(object.valueLong);
        xmlSerializer.writeEndElement();
      }

      // field valueLongType
      xmlSerializer.writeStartElement("valueLongType");
      xmlSerializer.writeLong(object.valueLongType);
      xmlSerializer.writeEndElement();

      // field valueShort
      if (object.valueShort!=null)  {
        xmlSerializer.writeStartElement("valueShort");
        xmlSerializer.writeInt(object.valueShort);
        xmlSerializer.writeEndElement();
      }

      // field valueShortType
      xmlSerializer.writeStartElement("valueShortType");
      xmlSerializer.writeInt(object.valueShortType);
      xmlSerializer.writeEndElement();

      // field valueString
      if (object.valueString!=null) {
        xmlSerializer.writeStartElement("valueString");
        xmlSerializer.writeCharacters(StringEscapeUtils.escapeXml10(object.valueString));
        xmlSerializer.writeEndElement();
      }

      // field valueTime
      if (object.valueTime!=null)  {
        xmlSerializer.writeStartElement("valueTime");
        xmlSerializer.writeCharacters(StringEscapeUtils.escapeXml10(TimeUtil.write(object.valueTime)));
        xmlSerializer.writeEndElement();
      }

      // field valueTimeZone
      if (object.valueTimeZone!=null)  {
        xmlSerializer.writeStartElement("valueTimeZone");
        xmlSerializer.writeCharacters(StringEscapeUtils.escapeXml10(TimeZoneUtil.write(object.valueTimeZone)));
        xmlSerializer.writeEndElement();
      }

      // field valueUrl
      if (object.valueUrl!=null)  {
        xmlSerializer.writeStartElement("valueUrl");
        xmlSerializer.writeCharacters(StringEscapeUtils.escapeXml10(UrlUtil.write(object.valueUrl)));
        xmlSerializer.writeEndElement();
      }

      // field id
      xmlSerializer.writeStartElement("name");
      xmlSerializer.writeLong(object.getId());
      xmlSerializer.writeEndElement();

      // field valueContentBoolType
      if (object.valueContentBoolType!=null)  {
        xmlSerializer.writeCData(String.valueOf(object.valueContentBoolType));
      }

      if (currentEventType == 0) {
        xmlSerializer.writeEndElement();
      }
    } catch(XMLStreamException e) {
      e.printStackTrace();
      throw (new KriptonRuntimeException(e));
    }
  }

  /**
   * create new object instance
   */
  @Override
  public BeanElement70 parseOnJackson(JacksonContext context, JacksonWrapperParser wrapper) {
    try {
      JsonParser jacksonParser = wrapper.jacksonParser;
      BeanElement70 instance = createInstance();
      String fieldName;
      if (jacksonParser.getCurrentToken() == null) {
        jacksonParser.nextToken();
      }
      if (jacksonParser.getCurrentToken() != JsonToken.START_OBJECT) {
        jacksonParser.skipChildren();
        return instance;
      }
      while (jacksonParser.nextToken() != JsonToken.END_OBJECT) {
        fieldName = jacksonParser.getCurrentName();
        jacksonParser.nextToken();

        // Parse fields:
        switch (fieldName) {
            case "valueBean":
              // field valueBean
              instance.valueBean=context.mapperFor(BeanElement70.class).parseOnJackson(context, wrapper);
            break;
            case "valueBigDecimal":
              // field valueBigDecimal
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueBigDecimal= new BigDecimal(jacksonParser.getText());
              }
            break;
            case "valueBigInteger":
              // field valueBigInteger
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueBigInteger= new BigInteger(jacksonParser.getText());
              }
            break;
            case "valueBool":
              // field valueBool
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueBool=jacksonParser.getBooleanValue();
              }
            break;
            case "valueBoolType":
              // field valueBoolType
              instance.valueBoolType=jacksonParser.getBooleanValue();
            break;
            case "valueByte":
              // field valueByte
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueByte=jacksonParser.getByteValue();
              }
            break;
            case "valueByteType":
              // field valueByteType
              instance.valueByteType=jacksonParser.getByteValue();
            break;
            case "valueCalendar":
              // field valueCalendar
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueCalendar= CalendarUtil.read(jacksonParser.getText());
              }
            break;
            case "valueChar":
              // field valueChar
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueChar=Character.valueOf((char)jacksonParser.getIntValue());
              }
            break;
            case "valueCharType":
              // field valueCharType
              instance.valueCharType=Character.valueOf((char)jacksonParser.getIntValue());
            break;
            case "valueCurrency":
              // field valueCurrency
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueCurrency= CurrencyUtil.read(jacksonParser.getText());
              }
            break;
            case "valueDate":
              // field valueDate
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueDate= DateUtil.read(jacksonParser.getText());
              }
            break;
            case "valueDouble":
              // field valueDouble
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueDouble=jacksonParser.getDoubleValue();
              }
            break;
            case "valueDoubleType":
              // field valueDoubleType
              instance.valueDoubleType=jacksonParser.getDoubleValue();
            break;
            case "valueEnum":
              // field valueEnum
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueEnum= BeanEnum.valueOf(jacksonParser.getText());
              }
            break;
            case "valueFloat":
              // field valueFloat
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueFloat=jacksonParser.getFloatValue();
              }
            break;
            case "valueFloatType":
              // field valueFloatType
              instance.valueFloatType=jacksonParser.getFloatValue();
            break;
            case "valueInt":
              // field valueInt
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueInt=jacksonParser.getIntValue();
              }
            break;
            case "valueIntType":
              // field valueIntType
              instance.valueIntType=jacksonParser.getIntValue();
            break;
            case "valueLocale":
              // field valueLocale
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueLocale= LocaleUtil.read(jacksonParser.getText());
              }
            break;
            case "valueLong":
              // field valueLong
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueLong=jacksonParser.getLongValue();
              }
            break;
            case "valueLongType":
              // field valueLongType
              instance.valueLongType=jacksonParser.getLongValue();
            break;
            case "valueShort":
              // field valueShort
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueShort=jacksonParser.getShortValue();
              }
            break;
            case "valueShortType":
              // field valueShortType
              instance.valueShortType=jacksonParser.getShortValue();
            break;
            case "valueString":
              // field valueString
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueString=jacksonParser.getText();
              }
            break;
            case "valueTime":
              // field valueTime
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueTime= TimeUtil.read(jacksonParser.getText());
              }
            break;
            case "valueTimeZone":
              // field valueTimeZone
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueTimeZone= TimeZoneUtil.read(jacksonParser.getText());
              }
            break;
            case "valueUrl":
              // field valueUrl
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueUrl= UrlUtil.read(jacksonParser.getText());
              }
            break;
            case "id":
              // field id
              instance.setId(jacksonParser.getLongValue());
            break;
            case "valueContentBoolType":
              // field valueContentBoolType
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueContentBoolType=jacksonParser.getIntValue();
              }
            break;
            default:
              jacksonParser.skipChildren();
            break;}
      }
      return instance;
    } catch (IOException e) {
      e.printStackTrace();
      throw new KriptonRuntimeException(e);
    }
  }

  /**
   * create new object instance
   */
  @Override
  public BeanElement70 parseOnJacksonAsString(JacksonContext context, JacksonWrapperParser wrapper) {
    try {
      JsonParser jacksonParser = wrapper.jacksonParser;
      BeanElement70 instance = createInstance();
      String fieldName;
      if (jacksonParser.getCurrentToken() == null) {
        jacksonParser.nextToken();
      }
      if (jacksonParser.getCurrentToken() != JsonToken.START_OBJECT) {
        jacksonParser.skipChildren();
        return instance;
      }
      while (jacksonParser.nextToken() != JsonToken.END_OBJECT) {
        fieldName = jacksonParser.getCurrentName();
        jacksonParser.nextToken();

        // Parse fields:
        switch (fieldName) {
            case "valueBean":
              // field valueBean
              instance.valueBean=context.mapperFor(BeanElement70.class).parseOnJacksonAsString(context, wrapper);
            break;
            case "valueBigDecimal":
              // field valueBigDecimal
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueBigDecimal=new BigDecimal(jacksonParser.getText());
              }
            break;
            case "valueBigInteger":
              // field valueBigInteger
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueBigInteger=new BigInteger(jacksonParser.getText());
              }
            break;
            case "valueBool":
              // field valueBool
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueBool=Boolean.valueOf(jacksonParser.getText());
              }
            break;
            case "valueBoolType":
              // field valueBoolType
              instance.valueBoolType=Boolean.valueOf(jacksonParser.getText());
            break;
            case "valueByte":
              // field valueByte
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueByte=Byte.valueOf(jacksonParser.getText());
              }
            break;
            case "valueByteType":
              // field valueByteType
              instance.valueByteType=Byte.valueOf(jacksonParser.getText());
            break;
            case "valueCalendar":
              // field valueCalendar
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueCalendar=CalendarUtil.read(jacksonParser.getText());
              }
            break;
            case "valueChar":
              // field valueChar
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueChar=Character.valueOf((char)(int)Integer.valueOf(jacksonParser.getText()));
              }
            break;
            case "valueCharType":
              // field valueCharType
              instance.valueCharType=Character.valueOf((char)(int)Integer.valueOf(jacksonParser.getText()));
            break;
            case "valueCurrency":
              // field valueCurrency
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueCurrency=CurrencyUtil.read(jacksonParser.getText());
              }
            break;
            case "valueDate":
              // field valueDate
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueDate=DateUtil.read(jacksonParser.getText());
              }
            break;
            case "valueDouble":
              // field valueDouble
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueDouble=Double.valueOf(jacksonParser.getText());
              }
            break;
            case "valueDoubleType":
              // field valueDoubleType
              instance.valueDoubleType=Double.valueOf(jacksonParser.getText());
            break;
            case "valueEnum":
              // field valueEnum
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueEnum=BeanEnum.valueOf(jacksonParser.getText());
              }
            break;
            case "valueFloat":
              // field valueFloat
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueFloat=Float.valueOf(jacksonParser.getText());
              }
            break;
            case "valueFloatType":
              // field valueFloatType
              instance.valueFloatType=Float.valueOf(jacksonParser.getText());
            break;
            case "valueInt":
              // field valueInt
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueInt=Integer.valueOf(jacksonParser.getText());
              }
            break;
            case "valueIntType":
              // field valueIntType
              instance.valueIntType=Integer.valueOf(jacksonParser.getText());
            break;
            case "valueLocale":
              // field valueLocale
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueLocale=LocaleUtil.read(jacksonParser.getText());
              }
            break;
            case "valueLong":
              // field valueLong
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueLong=Long.valueOf(jacksonParser.getText());
              }
            break;
            case "valueLongType":
              // field valueLongType
              instance.valueLongType=Long.valueOf(jacksonParser.getText());
            break;
            case "valueShort":
              // field valueShort
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueShort=Short.valueOf(jacksonParser.getText());
              }
            break;
            case "valueShortType":
              // field valueShortType
              instance.valueShortType=Short.valueOf(jacksonParser.getText());
            break;
            case "valueString":
              // field valueString
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueString=jacksonParser.getText();
              }
            break;
            case "valueTime":
              // field valueTime
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueTime=TimeUtil.read(jacksonParser.getText());
              }
            break;
            case "valueTimeZone":
              // field valueTimeZone
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueTimeZone=TimeZoneUtil.read(jacksonParser.getText());
              }
            break;
            case "valueUrl":
              // field valueUrl
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueUrl=UrlUtil.read(jacksonParser.getText());
              }
            break;
            case "id":
              // field id
              instance.setId(Long.valueOf(jacksonParser.getText()));
            break;
            case "valueContentBoolType":
              // field valueContentBoolType
              if (jacksonParser.currentToken()!=JsonToken.VALUE_NULL) {
                instance.valueContentBoolType=Integer.valueOf(jacksonParser.getText());
              }
            break;
            default:
              jacksonParser.skipChildren();
            break;}
      }
      return instance;
    } catch (IOException e) {
      e.printStackTrace();
      throw new KriptonRuntimeException(e);
    }
  }

  /**
   * create new object instance
   */
  @Override
  public BeanElement70 parseOnXml(XmlBinderContext context, XmlWrapperParser wrapper, int currentEventType) {
    try {
      XMLStreamReader2 xmlParser = wrapper.xmlParser;
      BeanElement70 instance = createInstance();
      int eventType = currentEventType;

      if (currentEventType == 0) {
        eventType = xmlParser.next();
      }
      String currentTag = xmlParser.getName().toString();
      Stack<String> elementNameStack = new Stack<>();
      elementNameStack.push(currentTag);
      // No attributes found

      //sub-elements
      while (xmlParser.hasNext() && !elementNameStack.isEmpty()) {
        eventType = xmlParser.next();
        switch(eventType) {
            case XMLEvent.START_ELEMENT:
              currentTag = xmlParser.getName().toString();
              switch(currentTag) {
                  case "valueBean":
                    // property valueBean
                    if (!xmlParser.isEmptyElement()) {
                      instance.valueBean=context.mapperFor(BeanElement70.class).parseOnXml(context, wrapper, eventType);
                    }
                  break;
                  case "valueBigDecimal":
                    // property valueBigDecimal
                    if (!xmlParser.isEmptyElement()) {
                      instance.valueBigDecimal=new BigDecimal(StringEscapeUtils.unescapeXml(xmlParser.getElementText()));
                    }
                  break;
                  case "valueBigInteger":
                    // property valueBigInteger
                    if (!xmlParser.isEmptyElement()) {
                      instance.valueBigInteger=new BigInteger(StringEscapeUtils.unescapeXml(xmlParser.getElementText()));
                    }
                  break;
                  case "valueBool":
                    // property valueBool
                    if (!xmlParser.isEmptyElement()) {
                      instance.valueBool=xmlParser.getElementAsBoolean();
                    }
                  break;
                  case "valueBoolType":
                    // property valueBoolType
                    if (!xmlParser.isEmptyElement()) {
                      instance.valueBoolType=xmlParser.getElementAsBoolean();
                    }
                  break;
                  case "valueByte":
                    // property valueByte
                    if (!xmlParser.isEmptyElement()) {
                      instance.valueByte=(byte)xmlParser.getElementAsInt();
                    }
                  break;
                  case "valueByteType":
                    // property valueByteType
                    if (!xmlParser.isEmptyElement()) {
                      instance.valueByteType=(byte)xmlParser.getElementAsInt();
                    }
                  break;
                  case "valueCalendar":
                    // property valueCalendar
                    if (!xmlParser.isEmptyElement()) {
                      instance.valueCalendar=CalendarUtil.read(StringEscapeUtils.unescapeXml(xmlParser.getElementText()));
                    }
                  break;
                  case "valueChar":
                    // property valueChar
                    if (!xmlParser.isEmptyElement()) {
                      instance.valueChar=(char)xmlParser.getElementAsInt();
                    }
                  break;
                  case "valueCharType":
                    // property valueCharType
                    if (!xmlParser.isEmptyElement()) {
                      instance.valueCharType=(char)xmlParser.getElementAsInt();
                    }
                  break;
                  case "valueCurrency":
                    // property valueCurrency
                    if (!xmlParser.isEmptyElement()) {
                      instance.valueCurrency=CurrencyUtil.read(StringEscapeUtils.unescapeXml(xmlParser.getElementText()));
                    }
                  break;
                  case "valueDate":
                    // property valueDate
                    if (!xmlParser.isEmptyElement()) {
                      instance.valueDate=DateUtil.read(StringEscapeUtils.unescapeXml(xmlParser.getElementText()));
                    }
                  break;
                  case "valueDouble":
                    // property valueDouble
                    if (!xmlParser.isEmptyElement()) {
                      instance.valueDouble=xmlParser.getElementAsDouble();
                    }
                  break;
                  case "valueDoubleType":
                    // property valueDoubleType
                    if (!xmlParser.isEmptyElement()) {
                      instance.valueDoubleType=xmlParser.getElementAsDouble();
                    }
                  break;
                  case "valueEnum":
                    // property valueEnum
                    if (!xmlParser.isEmptyElement()) {
                      instance.valueEnum=BeanEnum.valueOf(StringEscapeUtils.unescapeXml(xmlParser.getElementText()));
                    }
                  break;
                  case "valueFloat":
                    // property valueFloat
                    if (!xmlParser.isEmptyElement()) {
                      instance.valueFloat=xmlParser.getElementAsFloat();
                    }
                  break;
                  case "valueFloatType":
                    // property valueFloatType
                    if (!xmlParser.isEmptyElement()) {
                      instance.valueFloatType=xmlParser.getElementAsFloat();
                    }
                  break;
                  case "valueInt":
                    // property valueInt
                    if (!xmlParser.isEmptyElement()) {
                      instance.valueInt=xmlParser.getElementAsInt();
                    }
                  break;
                  case "valueIntType":
                    // property valueIntType
                    if (!xmlParser.isEmptyElement()) {
                      instance.valueIntType=xmlParser.getElementAsInt();
                    }
                  break;
                  case "valueLocale":
                    // property valueLocale
                    if (!xmlParser.isEmptyElement()) {
                      instance.valueLocale=LocaleUtil.read(StringEscapeUtils.unescapeXml(xmlParser.getElementText()));
                    }
                  break;
                  case "valueLong":
                    // property valueLong
                    if (!xmlParser.isEmptyElement()) {
                      instance.valueLong=xmlParser.getElementAsLong();
                    }
                  break;
                  case "valueLongType":
                    // property valueLongType
                    if (!xmlParser.isEmptyElement()) {
                      instance.valueLongType=xmlParser.getElementAsLong();
                    }
                  break;
                  case "valueShort":
                    // property valueShort
                    if (!xmlParser.isEmptyElement()) {
                      instance.valueShort=(short)xmlParser.getElementAsInt();
                    }
                  break;
                  case "valueShortType":
                    // property valueShortType
                    if (!xmlParser.isEmptyElement()) {
                      instance.valueShortType=(short)xmlParser.getElementAsInt();
                    }
                  break;
                  case "valueString":
                    // property valueString
                    if (!xmlParser.isEmptyElement()) {
                      instance.valueString=StringEscapeUtils.unescapeXml(xmlParser.getElementText());
                    }
                  break;
                  case "valueTime":
                    // property valueTime
                    if (!xmlParser.isEmptyElement()) {
                      instance.valueTime=TimeUtil.read(StringEscapeUtils.unescapeXml(xmlParser.getElementText()));
                    }
                  break;
                  case "valueTimeZone":
                    // property valueTimeZone
                    if (!xmlParser.isEmptyElement()) {
                      instance.valueTimeZone=TimeZoneUtil.read(StringEscapeUtils.unescapeXml(xmlParser.getElementText()));
                    }
                  break;
                  case "valueUrl":
                    // property valueUrl
                    if (!xmlParser.isEmptyElement()) {
                      instance.valueUrl=UrlUtil.read(StringEscapeUtils.unescapeXml(xmlParser.getElementText()));
                    }
                  break;
                  case "name":
                    // property id
                    if (!xmlParser.isEmptyElement()) {
                      instance.setId(xmlParser.getElementAsLong());
                    }
                  break;
                  default:
                    xmlParser.skipElement();
                  break;
                }
              break;
              case XMLEvent.END_ELEMENT:
                currentTag = elementNameStack.pop();
              break;
              case XMLEvent.CDATA:
              case XMLEvent.CHARACTERS:
                if (elementNameStack.size()==1 && xmlParser.hasText()) {
                  // property valueContentBoolType
                  instance.valueContentBoolType=Integer.valueOf(xmlParser.getText());
                }
              break;
              default:
              break;
          }
        }
        return instance;
      } catch(XMLStreamException e) {
        e.printStackTrace();
        throw (new KriptonRuntimeException(e));
      }
    }
  }
