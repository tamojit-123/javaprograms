package com.niit.streams;

import java.util.*;
import java.util.stream.Collectors;

public class CricketService {

    /**
     * Given a country and a name, find the cricketer from the entire data list of cricket players
     */
    public Optional<Cricket> getCricketerName(List<Cricket> cricketList, String cricketerName, String countryName) {
        Optional<Cricket> cricket = cricketList.stream().filter(c -> c.getName().equals(cricketerName) && c.getCountry().getName().equals(countryName)).findFirst();
        return cricket;
    }

    /**
     * Sort the list of cricketers in alphabetical order of their names belonging to a particular country.
     */
    public List<String> getCricketerNamesForCountry(List<Cricket> cricketList, String countryName) {
        List<Cricket> cricketernames = cricketList.stream().filter(c -> c.getCountry().getName().equals(countryName)).sorted((c1, c2) -> c1.getName().compareTo(c2.getName())).collect(Collectors.toList());
        List<String> listObj = new ArrayList<>();
        cricketernames.forEach(c -> listObj.add(c.getName()));
        return listObj;
    }

    /**
     * Search for cricketers who have played more than 50 matches
     */
    public List<Cricket> getPlayerNamePlayedMoreThan50Matches(List<Cricket> cricketList) {
        List<Cricket> cricketList1 = cricketList.stream().filter(c -> c.getMatchesPlayed() >= 50).collect(Collectors.toList());
        return cricketList1;
    }

    /**
     * Find the cricketers who have scored the highest runs for their country
     */
    public Integer getHighestRunsScoredByCricketer(List<Cricket> cricketList, String countryName) {
        Cricket cricketObj = cricketList.stream().filter(c -> c.getCountry().getName().equals(countryName)).max((i, j) -> i.getHighestScore() > j.getHighestScore() ? 1 : -1).get();
        return cricketObj.getHighestScore();

    }
}