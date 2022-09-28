class Hello {
     public static void main(String[] args){
      String s1 = "123";
      // new ＝インスタンス化（実体を作る）
      String s2 = new String("123");

      // 参照が正しいかを比較
      if (s1 == s2) {
        System.out.println("s1とs2は等しい");
      }

      // 値が正しいか比較
      // equals =値が等しいtrue,等しくない時にはfalse
      if(s1.equals(s2)) {
        System.out.println("s1とs2の値は等しい");
      }

      // 値の大小を比較
      // compareTo =比較
      int i = s1.compareTo(s2);
      if(i == 0) {
        System.out.println("値は等しい");
      } else if(i < 0) {
        System.out.println("s1はs2より小さい");
      } else if(i < 0) {
        System.out.println("s1はs2より大きい");
      }
     }
}
