public class SkillDemo {
  private String[] string15L = {"CSE", "15L"};
  public String getString(int index) {
    for(int i = 0; i < string15L.length(); i++){
      if(i == index) {
        return string15L[i];
      }
    }
  }
}
