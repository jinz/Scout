package com.scout;

public class DataManager {

	public static int hashTeamMatch(int team, int match)
	{
		return team * 1000000 + match;
	}
}
