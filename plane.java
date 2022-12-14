public class Plane {
  int location;
  public Plane() {
    location = 0;
  }
  public Plane(int loc) {
    if(loc > 2000) {
    loc = 0;
    }
    if(loc < -2000) {
    loc = 0;
    }
    location = loc;
  }
  public void upward() {
    if (location > 2000 || location > 1900) {
    location = 2000;
    } else {
    location = location + 100;
    }
  }
  public void downward() {
    if (location < -2000 || location < -1900) {
    location = -2000;  
    } else {
    location = location - 100;
    }
  }
  public int getLocation() {
    
    return location;
  }
  public String toString() {
    int currentSpace = 20;
    currentSpace = currentSpace + (location/100);
    String totalSpace = "@";
    for(int increment = 0; increment < currentSpace; increment++) {
      totalSpace = " " + totalSpace;
    }
    return totalSpace;
  }
}
