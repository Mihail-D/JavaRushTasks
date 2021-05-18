package com.javarush.task.pro.task16.task1616;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;
import java.util.TreeSet;

public class Solution {

    public static void main(String[] args) {
        TreeSet<String> sortedZones = getSortedZones();
        System.out.println(sortedZones.size());
        System.out.println(sortedZones.first());
        System.out.println(sortedZones.last());

        System.out.println(getBeijingTime());
    }

    static TreeSet<String> getSortedZones() {
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        TreeSet<String> st = new TreeSet<>();
        for (String zone : zoneIds) {
            st.add(zone);
        }
        return st;
    }

    static ZonedDateTime getBeijingTime() {
        ZoneId id = ZoneId.of("Asia/Shanghai");
        ZonedDateTime dt = ZonedDateTime.now(id);
        return dt;
    }
}
