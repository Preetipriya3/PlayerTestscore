/**
 * 
 */
package com.waterlabsqa.datatest;

import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.ebay.xcelite.Xcelite;
import com.ebay.xcelite.reader.SheetReader;
import com.ebay.xcelite.sheet.XceliteSheet;

/**
 * @author Preetipriya
 *
 */
public class PlayerOperations {

	
	@SuppressWarnings({ })
	public static void main(String[] args) {
		Xcelite xcelite = new Xcelite(new File("F://My_Projects//WaterLabTask//src//main//java//WaterLabsTest//dataTest//PlayerRatings.xlsx"));
		XceliteSheet sheet = xcelite.getSheet("Sheet1");
		SheetReader<Player> reader = sheet.getBeanReader(Player.class);
		Collection<Player> players = reader.read();
		System.out.println("players :"+players);
		
		Iterator<Player> iterator = players.iterator();
		while(iterator.hasNext()){
			Player p = (Player)iterator.next();
			if(p.getAge()>40){
				System.out.println(p.getName() +":"+p.getRating());
			}			
		}
		
		System.out.println("================================");
		List<Player> sortedPlayersList = (List<Player>) players;
		Player maxRating = Collections.max(sortedPlayersList, new RatingComparator());
		System.out.println("heighest age :"+maxRating.getAge() +" name : "+maxRating.getName()+" rating : "+maxRating.getRating());
		System.out.println("================================");
		Collections.sort(sortedPlayersList, new RatingComparator());
		Iterator<Player> iterator1 = sortedPlayersList.iterator();
		for(int i =1; iterator1.hasNext();i++){
			Player p = (Player)iterator1.next();
			System.out.println(p.getName() +":"+p.getRating());	
			if(i == 3)
				break;
		}
	}

}


class RatingComparator implements Comparator<Player>
{
    public int compare(Player o1, Player o2)
    {
       return o1.getRating().compareTo(o2.getRating());
   }
}
