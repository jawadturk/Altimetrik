
package com.example.altimetrik.data.data;


import com.example.altimetrik.model.ProposalsItem;

import java.util.ArrayList;
import java.util.List;

public class FakeRandomUserGeneratorAPI {


    public static List<ProposalsItem> getProposalsList() {
        List<ProposalsItem> peoples = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            peoples.add(getProposal());
        }
        return peoples;
    }

    public static ProposalsItem getProposal() {
        ProposalsItem proposalsItem = new ProposalsItem();
        proposalsItem.setId("123");
        proposalsItem.setTeacherName("Jenny");
        proposalsItem.setCity("SouthField");
        proposalsItem.setZip("22200");
        proposalsItem.setCostToComplete("2000");
        proposalsItem.setFulfillmentTrailer("Developing financial literacy is crucial for kids to be able to function in our society. Making change is a skill students need. Through playing games, students will develop the skills they need to make change and multiply sale prices. My students love to learn through play. By providing them games and a table they can write on, they will be able to enjoy their learning while developing essential skills for everyday life.");
        proposalsItem.setImageURL("https://storage.donorschoose.net/dc_prod/images/user/small/u4722310_sm.jpg?timestamp=1505729565296");
        proposalsItem.setState("Mi");
        proposalsItem.setTitle("Fund needed");
        proposalsItem.setTotalPrice("3000");
        proposalsItem.setPercentFunded("40");
        proposalsItem.setShortDescription("My students need math games to improve their sense of money and a table for small group work that they can write on while playing the games.");

        return proposalsItem;
    }
}
