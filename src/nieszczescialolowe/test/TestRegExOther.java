package nieszczescialolowe.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestRegExOther {

	@BeforeClass
	public static void init() {

	}

	@Test
	public void help() {
		assertEquals(
				new StringBuilder()
					.append("average game - Shows the average statistics from all games\n")
					.append("average game X - Shows the average statistics from last X games\n")
					.append("average stats champ X - Shows the average statistics of x champion\n")
					.append("average stats champ X Y - Shows the average statistics of x champion from the \n")
					.append("last y games\n")
					.append("average stats lane X - shows average stats from x lane\n")
					.append("average stats lane X Y - shows average stats in x lane from last y games\n")
					.append("clear - Clears the console\n")
					.append("help - Lists all commands\n")
					.append("list last X - Shows X last games\n")
					.append("most played champ - Shows the most played champ in any lane\n")
					.append("most played champ x - Shows the most played champ in the last x games\n")
					.append("most played lane - shows the most played lane from all games\n")
					.append("most played lane X - shows the most played lane from last x games\n")
					.toString(),
				Tests.runCommand("help"));
	}

	@Test
	public void clear() {
		assertEquals("cl", Tests.runCommand("clear"));
	}

	@Test
	public void listLastX() {
		assertEquals(
				new StringBuilder()
					.append("[kda/css: 5/6/6/253 ; champion: Maokai ; lane: Top ; time: 0:33:05 ; win/lose: L \n")
					.append("; afks: 2 ; grade: B]\n")
					.append("[kda/css: 8/5/8/363 ; champion: Maokai ; lane: Top ; time: 0:41:05 ; win/lose: L \n")
					.append("; afks: 1 ; grade: C]\n")
					.append("[kda/css: 9/3/5/294 ; champion: Fizz ; lane: Mid ; time: 0:37:05 ; win/lose: W ; \n")
					.append("afks: 0 ; grade: S]\n")
					.append("[kda/css: 14/4/7/256 ; champion: Fizz ; lane: Mid ; time: 0:52:55 ; win/lose: W ; \n")
					.append("afks: 0 ; grade: S]\n")
					.append("[kda/css: 11/4/13/463 ; champion: Fizz ; lane: Mid ; time: 1:01:05 ; win/lose: W \n")
					.append("; afks: 0 ; grade: S]\n")
					.toString(),
				Tests.runCommand("list last 5"));
	}

	@Test
	public void averageGameX() {
		assertEquals(
				new StringBuilder()
					.append("Average KDACss - 9/6/13/260\n")
					.append("Most played champion - Fizz\n")
					.append("Most played champion pickrate - 57.89\n")
					.append("Most played lane - Mid\n")
					.append("Most played lane % - 63.16\n")
					.append("Win ratio % - 63.16\n")
					.append("Average game time - 0:41:25\n")
					.append("Most often grade - S\n")
					.append("Most often grade % - 31.58\n")
					.append("Average afk's - 0.63")
					.toString(),
				Tests.runCommand("average game 20"));
	}

	@Test
	public void averageGame() {
		assertEquals(
				new StringBuilder()
					.append("Average KDACss - 9/6/13/260\n")
					.append("Most played champion - Fizz\n")
					.append("Most played champion pickrate - 57.89\n")
					.append("Most played lane - Mid\n")
					.append("Most played lane % - 63.16\n")
					.append("Win ratio % - 63.16\n")
					.append("Average game time - 0:41:25\n")
					.append("Most often grade - S\n")
					.append("Most often grade % - 31.58\n")
					.append("Average afk's - 0.63")
					.toString(), 
				Tests.runCommand("average game"));
	}
}
