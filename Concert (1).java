/**
 * 
 */
public class Concert 
{
  private String name;
  private int capacity;
  private int phoneticket;
  private int venueticket;
  private double phoneprice;
  private double venueprice;
  
  public Concert()
  {
    this.name = "Jane Doe";
    this.capacity = 0;
    this.phoneticket = 0;
    this.venueticket = 0;
    this.phoneprice = 0.0;
    this.venueprice = 0.0;
  }
   public Concert(String aname,int acapacity,double aphoneprice,double avenueprice)
  {
    this.setname(aname);
    this.setcapacity(acapacity); 
    this.setphoneprice(aphoneprice);
    this.setvenueprice(avenueprice);
  }
    
   public Concert(String aname,int acapacity,double aphoneprice,double avenueprice, int aphoneticket, int avenueticket)
  {
    this.setname(aname);
    this.setcapacity(acapacity); 
    this.setphoneprice(aphoneprice);
    this.setvenueprice(avenueprice);
    this.setphoneprice(aphoneprice);
    this.venueprice = 0.0;
  }
  public Concert(String aname, int acapacity, int aphoneticket, int avenueticket, double aphoneprice, double avenueprice)
  {
   //TODO call mutators 
  }
  
  //Accessors
  public String getname()
  {
    return this.name;
  }
  public int getcapacity()
  {
      return this.capacity;
    }
  public int getphoneticket()
  {
      return this.phoneticket;
  }
  public int getvenueticket()
  {
      return this.venueticket;
   }
  public double getphoneprice()
  {
      return this.phoneprice;
  }
  public double getvenueprice()
  {
    return this.venueprice;
  }
  
  //Mutators
  public void setname(String aname)
  {
    this.name = aname;
  }
  public void setcapacity(int acapacity)
  {
     if(acapacity>=0);
    {
      this.capacity = acapacity;
    }
  }
  public void setphoneticket(int aphoneticket)
  {
    if(aphoneticket>=0);
    {
    this.phoneticket = aphoneticket;
    }
  }
  public void setvenueticket(int avenueticket)
  {
    if(avenueticket>=0);
    {
    this.venueticket = avenueticket;
    }
  }
  public void setphoneprice(double aphoneprice)
  {
    if(aphoneprice >=0);
    {
      this.phoneprice = aphoneprice;
    }
  }
  public void setvenueprice(double avenueprice)
  {
    if(avenueprice >= 0);
    {
      this.venueprice = avenueprice;
    }
  }
  //Method
  public int TotalNumberOfTicketsSold()
  {
    return this.phoneticket+this.venueticket;
  }
  public int TicketsRemaining()
  {
    return (this.capacity-TotalNumberOfTicketsSold());
  }
  public void BuyTicketsAtVenue(int venuetickets)
  {
    if (TicketsRemaining()>this.venueticket)
    {
      venueticket+=venuetickets;
    }
  }
  public void BuyTicketsByPhone(int phonetickets)
  {
    if(TicketsRemaining()>this.phoneticket)
    {
      phoneticket+=phonetickets;
   }
  }
  public double TotalSales()
  {
    return ((this.venueprice*this.venueticket) + (this.phoneprice*this.phoneticket));
  }
}
  
  
    