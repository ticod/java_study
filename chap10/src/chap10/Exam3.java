/*
 * UnsupportFunctionException 클래스 구현하기
 * 1. 멤버 변수: private final int ERR_CODE;
 * 2. 멤버 메서드:
 *       public int getErrCode(): ERR_CODE값 반환
 *       public String getMessage(): overriding method
 *         부모 클래스의 message 값과 ERR_CODE값 반환
 * 3. 예외처리를 안해도 되도록 구현
 * 4. 생성자는 구동클래스의 호출에 맞도록 구현
 */
package chap10;

class UnsupportFunctionException extends RuntimeException {
	private final int ERR_CODE;
	
	UnsupportFunctionException(String msg, int code) {
		super(msg);
		this.ERR_CODE = code;
	}
	
	public int gerErrCode() {
		return ERR_CODE;
	}
	
	@Override
	public String getMessage() {
		return super.getMessage() + " ERROR CODE:" + ERR_CODE;
	}
}

public class Exam3 {
	public static void main(String[] args) {
		try {
			throw new UnsupportFunctionException("지원하지 않는 기능입니다.", 200);
		} catch (UnsupportFunctionException e){
			System.out.println(e.getMessage());
			System.out.println(e.gerErrCode());
		}
	}
}
