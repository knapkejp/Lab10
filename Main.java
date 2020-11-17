class Main {
  public static void main(String[] args) {
    Sugar tree = new Sugar();
    Sugar aCookie = new Sugar();

    tree.cutOut("tree", 10);
    tree.bake(350,12);
    tree.decorate();

    aCookie.decorate();
  }
}