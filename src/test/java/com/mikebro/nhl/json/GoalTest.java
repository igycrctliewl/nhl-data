package com.mikebro.nhl.json;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.mikebro.jsonhelper.JsonHelper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

public class GoalTest {

	@Test
	public void testGoal() {
		Goal goal = Goal.builder()
				.period( 1 )
				.periodDescriptor( PeriodDescriptor.builder()
						.number( 1 )
						.periodType( "REG ")
						.maxRegulationPeriods( 3 )
						.build() )
				.timeInPeriod( "05:41" )
				.playerId( 8480246L )
				.name( Name.builder()
						.name( "N. Perbix" )
						.build() )
				.firstName( Name.builder()
						.name( "Nick" )
						.build() )
				.lastName( Name.builder()
						.name( "Perbix" )
						.build() )
				.goalModifier( "none" )
				.assists( new ArrayList<>() )
				.mugshot( "https://assets.nhle.com/mugs/nhl/20242025/TBL/8480246.png" )
				.teamAbbrev( "TBL" )
				.goalsToDate( 2 )
				.awayScore( 0 )
				.homeScore( 1 )
				.strength( "ev" )
				.highlightClipSharingUrl( "https://nhl.com/video/nick-perbix-with-a-goal-vs-colorado-avalanche-6365184965112" )
				.highlightClipSharingUrlFr( "https://nhl.com/fr/video/col-tbl-perbix-marque-un-but-contre-justus-annunen-6365184464112" )
				.highlightClip( 6365184965112L )
				.highlightClipFr( 6365184464112L )
				.discreteClip( 6365184877112L )
				.discreteClipFr( 6365184964112L )
				.build();

		assertEquals( (Integer) 1, goal.getPeriod() );
		assertNotNull( goal.getPeriodDescriptor() );
		assertEquals( "05:41", goal.getTimeInPeriod() );
		assertEquals( (Long) 8480246L, goal.getPlayerId() );
		assertEquals( "N. Perbix", goal.getName().toString() );
		assertEquals( "Nick", goal.getFirstName().toString() );
		assertEquals( "Perbix", goal.getLastName().toString() );
		assertEquals( "none", goal.getGoalModifier() );
		assertEquals( "https://assets.nhle.com/mugs/nhl/20242025/TBL/8480246.png", goal.getMugshot() );
		assertEquals( "TBL", goal.getTeamAbbrev() );
		assertEquals( (Integer) 2, goal.getGoalsToDate() );
		assertEquals( (Integer) 0, goal.getAwayScore() );
		assertEquals( (Integer) 1, goal.getHomeScore() );
		assertEquals( "ev", goal.getStrength() );
		assertEquals( "https://nhl.com/video/nick-perbix-with-a-goal-vs-colorado-avalanche-6365184965112", goal.getHighlightClipSharingUrl() );
		assertEquals( "https://nhl.com/fr/video/col-tbl-perbix-marque-un-but-contre-justus-annunen-6365184464112", goal.getHighlightClipSharingUrlFr() );
		assertEquals( (Long) 6365184965112L, goal.getHighlightClip() );
		assertEquals( (Long) 6365184464112L, goal.getHighlightClipFr() );
		assertEquals( (Long) 6365184877112L, goal.getDiscreteClip() );
		assertEquals( (Long) 6365184964112L, goal.getDiscreteClipFr() );
	}


	@Test
	public void testGoalJson() {
		String json = "{\"period\":1,\"periodDescriptor\":{\"number\":1,\"periodType\":\"REG\",\"maxRegulationPeriods\":3},\"timeInPeriod\":\"05:41\",\"playerId\":8480246,\"name\":{\"default\":\"N. Perbix\"},\"firstName\":{\"default\":\"Nick\"},\"lastName\":{\"default\":\"Perbix\"},\"goalModifier\":\"none\",\"assists\":[],\"mugshot\":\"https://assets.nhle.com/mugs/nhl/20242025/TBL/8480246.png\",\"teamAbbrev\":\"TBL\",\"goalsToDate\":2,\"awayScore\":0,\"homeScore\":1,\"strength\":\"ev\",\"highlightClipSharingUrl\":\"https://nhl.com/video/nick-perbix-with-a-goal-vs-colorado-avalanche-6365184965112\",\"highlightClipSharingUrlFr\":\"https://nhl.com/fr/video/col-tbl-perbix-marque-un-but-contre-justus-annunen-6365184464112\",\"highlightClip\":6365184965112,\"highlightClipFr\":6365184464112,\"discreteClip\":6365184877112,\"discreteClipFr\":6365184964112}";
		Goal goal = JsonHelper.jsonToObject( json, Goal.class);

		assertEquals( (Integer) 1, goal.getPeriod() );
		assertNotNull( goal.getPeriodDescriptor() );
		assertEquals( "05:41", goal.getTimeInPeriod() );
		assertEquals( (Long) 8480246L, goal.getPlayerId() );
		assertEquals( "N. Perbix", goal.getName().toString() );
		assertEquals( "Nick", goal.getFirstName().toString() );
		assertEquals( "Perbix", goal.getLastName().toString() );
		assertEquals( "none", goal.getGoalModifier() );
		assertEquals( "https://assets.nhle.com/mugs/nhl/20242025/TBL/8480246.png", goal.getMugshot() );
		assertEquals( "TBL", goal.getTeamAbbrev() );
		assertEquals( (Integer) 2, goal.getGoalsToDate() );
		assertEquals( (Integer) 0, goal.getAwayScore() );
		assertEquals( (Integer) 1, goal.getHomeScore() );
		assertEquals( "ev", goal.getStrength() );
		assertEquals( "https://nhl.com/video/nick-perbix-with-a-goal-vs-colorado-avalanche-6365184965112", goal.getHighlightClipSharingUrl() );
		assertEquals( "https://nhl.com/fr/video/col-tbl-perbix-marque-un-but-contre-justus-annunen-6365184464112", goal.getHighlightClipSharingUrlFr() );
		assertEquals( (Long) 6365184965112L, goal.getHighlightClip() );
		assertEquals( (Long) 6365184464112L, goal.getHighlightClipFr() );
		assertEquals( (Long) 6365184877112L, goal.getDiscreteClip() );
		assertEquals( (Long) 6365184964112L, goal.getDiscreteClipFr() );

		String string = JsonHelper.objectToJson( goal );
		assertEquals( json, string );
	}


	@Test
	public void testGoalsJson() {
		String json = "{\"goals\":[{\"period\":1,\"periodDescriptor\":{\"number\":1,\"periodType\":\"REG\",\"maxRegulationPeriods\":3},\"timeInPeriod\":\"05:41\",\"playerId\":8480246,\"name\":{\"default\":\"N. Perbix\"},\"firstName\":{\"default\":\"Nick\",\"cs\":\"Nicklaus\",\"de\":\"Nicklaus\",\"es\":\"Nicklaus\",\"fi\":\"Nicklaus\",\"sk\":\"Nicklaus\",\"sv\":\"Nicklaus\"},\"lastName\":{\"default\":\"Perbix\"},\"goalModifier\":\"none\",\"assists\":[],\"mugshot\":\"https://assets.nhle.com/mugs/nhl/20242025/TBL/8480246.png\",\"teamAbbrev\":\"TBL\",\"goalsToDate\":2,\"awayScore\":0,\"homeScore\":1,\"strength\":\"ev\",\"highlightClipSharingUrl\":\"https://nhl.com/video/nick-perbix-with-a-goal-vs-colorado-avalanche-6365184965112\",\"highlightClipSharingUrlFr\":\"https://nhl.com/fr/video/col-tbl-perbix-marque-un-but-contre-justus-annunen-6365184464112\",\"highlightClip\":6365184965112,\"highlightClipFr\":6365184464112,\"discreteClip\":6365184877112,\"discreteClipFr\":6365184964112},{\"period\":1,\"periodDescriptor\":{\"number\":1,\"periodType\":\"REG\",\"maxRegulationPeriods\":3},\"timeInPeriod\":\"07:46\",\"playerId\":8477404,\"name\":{\"default\":\"J. Guentzel\"},\"firstName\":{\"default\":\"Jake\"},\"lastName\":{\"default\":\"Guentzel\"},\"goalModifier\":\"none\",\"assists\":[{\"playerId\":8479542,\"name\":{\"default\":\"B. Hagel\"},\"assistsToDate\":13},{\"playerId\":8476453,\"name\":{\"default\":\"N. Kucherov\",\"cs\":\"N. Kučerov\",\"fi\":\"N. Kutsherov\",\"sk\":\"N. Kučerov\"},\"assistsToDate\":19}],\"mugshot\":\"https://assets.nhle.com/mugs/nhl/20242025/TBL/8477404.png\",\"teamAbbrev\":\"TBL\",\"goalsToDate\":8,\"awayScore\":0,\"homeScore\":2,\"strength\":\"pp\",\"highlightClipSharingUrl\":\"https://nhl.com/video/col-tbl-guentzel-scores-goal-against-justus-annunen-6365184668112\",\"highlightClipSharingUrlFr\":\"https://nhl.com/fr/video/col-tbl-guentzel-marque-un-but-contre-justus-annunen-6365185244112\",\"highlightClip\":6365184668112,\"highlightClipFr\":6365185244112,\"discreteClip\":6365185249112,\"discreteClipFr\":6365183403112},{\"period\":1,\"periodDescriptor\":{\"number\":1,\"periodType\":\"REG\",\"maxRegulationPeriods\":3},\"timeInPeriod\":\"08:56\",\"playerId\":8483930,\"name\":{\"default\":\"I. Ivan\"},\"firstName\":{\"default\":\"Ivan\"},\"lastName\":{\"default\":\"Ivan\"},\"goalModifier\":\"none\",\"assists\":[{\"playerId\":8477501,\"name\":{\"default\":\"V. Nichushkin\",\"cs\":\"V. Ničuškin\",\"fi\":\"V. Nitshushkin\",\"sk\":\"V. Ničuškin\"},\"assistsToDate\":3},{\"playerId\":8476312,\"name\":{\"default\":\"J. Manson\"},\"assistsToDate\":5}],\"mugshot\":\"https://assets.nhle.com/mugs/nhl/20242025/COL/8483930.png\",\"teamAbbrev\":\"COL\",\"goalsToDate\":4,\"awayScore\":1,\"homeScore\":2,\"strength\":\"ev\",\"highlightClipSharingUrl\":\"https://nhl.com/video/col-tbl-ivan-scores-goal-against-andrei-vasilevskiy-6365184112112\",\"highlightClipSharingUrlFr\":\"https://nhl.com/fr/video/col-tbl-ivan-marque-un-but-contre-andrei-vasilevskiy-6365185542112\",\"highlightClip\":6365184112112,\"highlightClipFr\":6365185542112,\"discreteClip\":6365184264112,\"discreteClipFr\":6365185248112},{\"period\":1,\"periodDescriptor\":{\"number\":1,\"periodType\":\"REG\",\"maxRegulationPeriods\":3},\"timeInPeriod\":\"10:03\",\"playerId\":8476453,\"name\":{\"default\":\"N. Kucherov\",\"cs\":\"N. Kučerov\",\"fi\":\"N. Kutsherov\",\"sk\":\"N. Kučerov\"},\"firstName\":{\"default\":\"Nikita\"},\"lastName\":{\"default\":\"Kucherov\",\"cs\":\"Kučerov\",\"fi\":\"Kutsherov\",\"sk\":\"Kučerov\"},\"goalModifier\":\"none\",\"assists\":[{\"playerId\":8479542,\"name\":{\"default\":\"B. Hagel\"},\"assistsToDate\":14}],\"mugshot\":\"https://assets.nhle.com/mugs/nhl/20242025/TBL/8476453.png\",\"teamAbbrev\":\"TBL\",\"goalsToDate\":12,\"awayScore\":1,\"homeScore\":3,\"strength\":\"ev\",\"highlightClipSharingUrl\":\"https://nhl.com/video/col-tbl-kucherov-scores-goal-against-justus-annunen-6365183720112\",\"highlightClipSharingUrlFr\":\"https://nhl.com/fr/video/col-tbl-kucherov-marque-un-but-contre-justus-annunen-6365184609112\",\"highlightClip\":6365183720112,\"highlightClipFr\":6365184609112,\"discreteClip\":6365184117112,\"discreteClipFr\":6365184395112},{\"period\":1,\"periodDescriptor\":{\"number\":1,\"periodType\":\"REG\",\"maxRegulationPeriods\":3},\"timeInPeriod\":\"13:15\",\"playerId\":8476822,\"name\":{\"default\":\"L. Glendening\"},\"firstName\":{\"default\":\"Luke\"},\"lastName\":{\"default\":\"Glendening\"},\"goalModifier\":\"none\",\"assists\":[{\"playerId\":8479542,\"name\":{\"default\":\"B. Hagel\"},\"assistsToDate\":15}],\"mugshot\":\"https://assets.nhle.com/mugs/nhl/20242025/TBL/8476822.png\",\"teamAbbrev\":\"TBL\",\"goalsToDate\":1,\"awayScore\":1,\"homeScore\":4,\"strength\":\"sh\",\"highlightClipSharingUrl\":\"https://nhl.com/video/col-tbl-glendening-scores-goal-against-alexandar-georgiev-6365185656112\",\"highlightClipSharingUrlFr\":\"https://nhl.com/fr/video/col-tbl-glendening-marque-un-but-contre-alexandar-georgiev-6365185852112\",\"highlightClip\":6365185656112,\"highlightClipFr\":6365185852112,\"discreteClip\":6365184295112,\"discreteClipFr\":6365184688112},{\"period\":1,\"periodDescriptor\":{\"number\":1,\"periodType\":\"REG\",\"maxRegulationPeriods\":3},\"timeInPeriod\":\"19:46\",\"playerId\":8478519,\"name\":{\"default\":\"A. Cirelli\"},\"firstName\":{\"default\":\"Anthony\"},\"lastName\":{\"default\":\"Cirelli\"},\"goalModifier\":\"none\",\"assists\":[{\"playerId\":8478416,\"name\":{\"default\":\"E. Cernak\",\"cs\":\"E. Černák\",\"sk\":\"E. Černák\"},\"assistsToDate\":6},{\"playerId\":8479542,\"name\":{\"default\":\"B. Hagel\"},\"assistsToDate\":16}],\"mugshot\":\"https://assets.nhle.com/mugs/nhl/20242025/TBL/8478519.png\",\"teamAbbrev\":\"TBL\",\"goalsToDate\":9,\"awayScore\":1,\"homeScore\":5,\"strength\":\"ev\",\"highlightClipSharingUrl\":\"https://nhl.com/video/col-tbl-cirelli-scores-goal-against-alexandar-georgiev-6365186091112\",\"highlightClipSharingUrlFr\":\"https://nhl.com/fr/video/col-tbl-cirelli-marque-un-but-contre-alexandar-georgiev-6365186461112\",\"highlightClip\":6365186091112,\"highlightClipFr\":6365186461112,\"discreteClip\":6365185483112,\"discreteClipFr\":6365186169112},{\"period\":2,\"periodDescriptor\":{\"number\":2,\"periodType\":\"REG\",\"maxRegulationPeriods\":3},\"timeInPeriod\":\"09:38\",\"playerId\":8478010,\"name\":{\"default\":\"B. Point\"},\"firstName\":{\"default\":\"Brayden\"},\"lastName\":{\"default\":\"Point\"},\"goalModifier\":\"none\",\"assists\":[{\"playerId\":8479542,\"name\":{\"default\":\"B. Hagel\"},\"assistsToDate\":17},{\"playerId\":8476453,\"name\":{\"default\":\"N. Kucherov\",\"cs\":\"N. Kučerov\",\"fi\":\"N. Kutsherov\",\"sk\":\"N. Kučerov\"},\"assistsToDate\":20}],\"mugshot\":\"https://assets.nhle.com/mugs/nhl/20242025/TBL/8478010.png\",\"teamAbbrev\":\"TBL\",\"goalsToDate\":12,\"awayScore\":1,\"homeScore\":6,\"strength\":\"pp\",\"highlightClipSharingUrl\":\"https://nhl.com/video/col-tbl-point-scores-goal-against-alexandar-georgiev-6365186626112\",\"highlightClipSharingUrlFr\":\"https://nhl.com/fr/video/col-tbl-point-marque-un-but-contre-alexandar-georgiev-6365187488112\",\"highlightClip\":6365186626112,\"highlightClipFr\":6365187488112,\"discreteClip\":6365187017112,\"discreteClipFr\":6365186929112},{\"period\":3,\"periodDescriptor\":{\"number\":3,\"periodType\":\"REG\",\"maxRegulationPeriods\":3},\"timeInPeriod\":\"01:08\",\"playerId\":8483930,\"name\":{\"default\":\"I. Ivan\"},\"firstName\":{\"default\":\"Ivan\"},\"lastName\":{\"default\":\"Ivan\"},\"goalModifier\":\"none\",\"assists\":[],\"mugshot\":\"https://assets.nhle.com/mugs/nhl/20242025/COL/8483930.png\",\"teamAbbrev\":\"COL\",\"goalsToDate\":5,\"awayScore\":2,\"homeScore\":6,\"strength\":\"ev\",\"highlightClipSharingUrl\":\"https://nhl.com/video/col-tbl-ivan-scores-goal-against-andrei-vasilevskiy-6365189786112\",\"highlightClipSharingUrlFr\":\"https://nhl.com/fr/video/col-tbl-ivan-marque-un-but-contre-andrei-vasilevskiy-6365187947112\",\"highlightClip\":6365189786112,\"highlightClipFr\":6365187947112,\"discreteClip\":6365189688112,\"discreteClipFr\":6365187754112},{\"period\":3,\"periodDescriptor\":{\"number\":3,\"periodType\":\"REG\",\"maxRegulationPeriods\":3},\"timeInPeriod\":\"03:09\",\"playerId\":8477404,\"name\":{\"default\":\"J. Guentzel\"},\"firstName\":{\"default\":\"Jake\"},\"lastName\":{\"default\":\"Guentzel\"},\"goalModifier\":\"none\",\"assists\":[{\"playerId\":8480246,\"name\":{\"default\":\"N. Perbix\"},\"assistsToDate\":4}],\"mugshot\":\"https://assets.nhle.com/mugs/nhl/20242025/TBL/8477404.png\",\"teamAbbrev\":\"TBL\",\"goalsToDate\":9,\"awayScore\":2,\"homeScore\":7,\"strength\":\"ev\",\"highlightClipSharingUrl\":\"https://nhl.com/video/col-tbl-guentzel-scores-goal-against-justus-annunen-6365188736112\",\"highlightClipSharingUrlFr\":\"https://nhl.com/fr/video/col-tbl-guentzel-marque-un-but-contre-justus-annunen-6365188738112\",\"highlightClip\":6365188736112,\"highlightClipFr\":6365188738112,\"discreteClip\":6365189409112,\"discreteClipFr\":6365188732112},{\"period\":3,\"periodDescriptor\":{\"number\":3,\"periodType\":\"REG\",\"maxRegulationPeriods\":3},\"timeInPeriod\":\"04:44\",\"playerId\":8479591,\"name\":{\"default\":\"M. Eyssimont\"},\"firstName\":{\"default\":\"Michael\"},\"lastName\":{\"default\":\"Eyssimont\"},\"goalModifier\":\"none\",\"assists\":[{\"playerId\":8476878,\"name\":{\"default\":\"Z. Girgensons\"},\"assistsToDate\":1}],\"mugshot\":\"https://assets.nhle.com/mugs/nhl/20242025/TBL/8479591.png\",\"teamAbbrev\":\"TBL\",\"goalsToDate\":1,\"awayScore\":2,\"homeScore\":8,\"strength\":\"ev\",\"highlightClipSharingUrl\":\"https://nhl.com/video/col-tbl-eyssimont-scores-goal-against-justus-annunen-6365189889112\",\"highlightClipSharingUrlFr\":\"https://nhl.com/fr/video/col-tbl-eyssimont-marque-un-but-contre-justus-annunen-6365189329112\",\"highlightClip\":6365189889112,\"highlightClipFr\":6365189329112,\"discreteClip\":6365189514112,\"discreteClipFr\":6365189416112}]}";
		GoalsTest gt = JsonHelper.jsonToObject( json, GoalsTest.class);

		assertEquals( 10, gt.getGoals().size() );
	}

	@Data
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	static class GoalsTest {
		List<Goal> goals;
	}
}
