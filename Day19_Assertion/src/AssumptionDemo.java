import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionDemo {
    @Test
	void testonDev()
	{
		System.setProperty("ENV","DEV");
		Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")));
	}
    @Test
	void testonDev1()
	{
		System.setProperty("ENV","DEV");
		Assumptions.assumeFalse("DEV".equals(System.getProperty("ENV")));
	}
    @Test
	void testonProd()
	{
		System.setProperty("ENV","PROD");
		Assumptions.assumingThat("DEV".equals(System.getProperty("ENV")),AssumptionDemo:: message);
	}
	private static String message() {
		return "Today's TEST Execution Failed ::";
		
	}
}
