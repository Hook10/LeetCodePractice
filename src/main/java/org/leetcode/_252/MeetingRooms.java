package org.leetcode._252;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MeetingRooms {
  public static void main(String[] args) {
    Interval interval = new Interval(7, 10);
    Interval interval1 = new Interval(2, 5);
    List<Interval> list = new ArrayList<>();
    list.add(interval);
    list.add(interval1);
    System.out.println(canAttendMeetings(list));

  }

  private static boolean canAttendMeetings(List<Interval> intervals) {
      if (intervals.isEmpty()) return true;

      intervals.sort(Comparator.comparingInt(o -> o.start));

      for (int i = 1; i < intervals.size(); i++) {
        if (intervals.get(i).start < intervals.get(i - 1).end) {
          return false;
        }
      }
    return true;
  }
}

class Interval {
  int start, end;

  Interval(int start, int end) {
    this.start = start;
    this.end = end;
  }
}
