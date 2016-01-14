package unit;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.junit.Assert;
import org.junit.Test;

import com.notnoop.apns.APNS;
import com.notnoop.apns.PayloadBuilder;

public class PushCreatePayloadBuilderTest {
	
	//Test for issue #357
	@Test
	public void PushCreatePayloadBuilder(){
		try{	
			APNS apns = null;
			PayloadBuilder pb = apns.newPayload();
		}
		catch(Throwable e){
			Assert.fail("Test failed:" +ExceptionUtils.getMessage(e));
		}
	}
}
