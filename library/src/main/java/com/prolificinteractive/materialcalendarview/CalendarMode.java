package com.prolificinteractive.materialcalendarview;

@Experimental
public enum CalendarMode {

    MONTHS(4),
    WEEKS(1);

    final int visibleWeeksCount;

    CalendarMode(int visibleWeeksCount) {
        this.visibleWeeksCount = visibleWeeksCount;
    }
}
