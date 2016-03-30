package sysvoting;

import org.junit.Test;

import com.entelgy.sysvoting.entity.Option;
import com.entelgy.sysvoting.entity.Voting;
import com.entelgy.sysvoting.rest.VotingRestService;

public class VotingTest {
	
	VotingRestService votingRestService = new VotingRestService();
	Long amountReq = 1000000L;
	
	@Test
	public void getPartialPercentageTest() {
		votingRestService.getPartialPercentage();
	}
	
	@Test
	public void insert() {
		for (int i = 0; i < amountReq; i++) {
			Voting voting = new Voting();
			voting.setOption(new Option());
			voting.getOption().setId(rand(1, 3));
			votingRestService.insert(voting);
		}
	}
	
	private static Long rand(int Str, int End){
		Integer i = (int) Math.ceil(Math.random() * (End  - Str + 1)) - 1 + Str;
        return Long.parseLong(i.toString());
    }
}
