// Report5.java
public class Report5 {
	public static void main(String[] args) {
		// 条件1
		String str = "壱百満";
		try {
			// 条件2: Integer.parseIntを使用
			int value = Integer.parseInt(str);
			System.out.println(value);
		} catch (NumberFormatException e) {
			// 例外発生時の処理
			System.out.println("NumberFormatExceptionが発生しました。");
			System.out.println("エラーメッセージ: " + e.getMessage());
		}
	}
}
