package sqlite.indexes;

import java.util.Date;

import com.abubusoft.kripton.android.ColumnType;
import com.abubusoft.kripton.android.annotation.BindColumn;
import com.abubusoft.kripton.android.annotation.BindTable;
import com.abubusoft.kripton.annotation.BindType;

@BindType
@BindTable(indexes={"birthCity birthDay"})
public class Err2Person {
  public long id;
  
  
  @BindColumn(columnType=ColumnType.INDEXED)
  public String name;
  
  public String surname;
  public String birthCity;
  public Date birthDay;
}