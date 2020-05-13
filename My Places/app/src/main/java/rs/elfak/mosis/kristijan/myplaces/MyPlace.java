package rs.elfak.mosis.kristijan.myplaces;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class MyPlace {
    public String name;
    public String description;
    public String longitude;
    public String latitude;
    int ID;

    @Exclude
    public String key;

    public MyPlace(String nme, String desc)
    {
        this.name = nme;
        this.description = desc;
    }
    public MyPlace(String nme)
    {
        this(nme, "");
    }
    public String getName()
    {
        return name;
    }
    public String getDesc()
    {
        return description;
    }
    public void setName(String nme)
    {
        this.name = nme;
    }
    public void setDesc(String desc)
    {
        this.description = desc;
    }

    @Override
    public String toString()
    {
        return this.name;
    }

    public String getLongitude(){return longitude;}
    public String getLatitude(){return latitude;}
    public void setLongitude(String longitude){this.longitude = longitude;}
    public void setLatitude(String latitude){this.latitude = latitude;}

    public int getID(){return ID;}
    public void setID(int id){this.ID = id;}
}
