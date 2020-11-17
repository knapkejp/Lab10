class Sugar extends Cookie {
  private String shape;
  private boolean isDecorated;

//Constructor Setting default values as 0 or false
Sugar(){
  shape = "";
  isDecorated = false;
}

//Constructor Setting shape to a paramter and isDecorated to false
Sugar(String aShape){
  shape = aShape;
  isDecorated = false;
}

//Accessor Method for shape variable
String getShape() {
    return shape;
  }

//Mutator Method for shape variable
void setShape(String aShape) {
    shape = aShape;
  }

//Method to Cut Out Shapes
void cutOut(String shape, int number){
  System.out.println(+number+ " cookies were cut into " +shape);
  // Cookie.setNumber(number);
}

//Method to Decorate Cookies
void decorate(){
  if (isReady = getIsReady()) {
    System.out.println("The cookies were decorated");
  }
  else {
    System.out.println("Make sure to bake the cookies first");
  }
  }
}