class Cookie {
  int number;
  private int bakeTemp;
  private int bakeTime;
  boolean isReady;

//Constructor Setting default values as 0 or false
Cookie() {
  number = 0;
  bakeTemp = 0;
  bakeTime = 0;
  isReady = false;
}

//Constructor Setting Instance Variables to parameter
Cookie(int aNumber, int aBakeTemp, int aBakeTime) {
  number = aNumber;
  bakeTemp = aBakeTemp;
  bakeTime = aBakeTime;
  isReady = false;
}

//Accessor Method for isReady variable
boolean getIsReady() {
    return isReady;
  }

//Mutator Method for number variable
void setNumber(int aNumber) {
    number = aNumber;
  }

//Method to Bake Cookies
void bake(int bakeTemp, int bakeTime) {
  System.out.println("The cookies were baked at " +bakeTemp+ " degrees F for " +bakeTime+ " minutes");
  isReady = true;
}

}