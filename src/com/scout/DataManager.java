package com.scout;

import java.util.HashMap;
import java.util.ArrayList;
import android.annotation.SuppressLint;
import com.scout.data.*;

public class DataManager {
	
	private HashMap<Integer, ArrayList<Integer>> teamToMatches;
	private HashMap<Integer, ArrayList<Integer>> matchToTeams;
	private HashMap<Integer, ScoutSheet> scoutData;
	
	public static int hashTeamMatch(int team, int match)
	{
		return team * 1000000 + match;
	}
}
