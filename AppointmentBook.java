public class AppointmentBook {

/*
Returns true if minute in period is available for an appointment and returns false otherwise
Preconditions: 1 <= period <= 8; 0 <= minute <= 59
*/

public AppointmentBook() {

}

public boolean isMinuteFree(int period, int minute) {
    if (period == 1) {
        if ((0 <= minute && minute <= 9) || (15 <= minute && minute <= 29) || (45 <= minute && minute <= 49)) {
            return false;
        } else {
            return true;
        }
    } else if (period==2) {
        if (25 <= minute && minute<=29) {
            return true;
        } else {
            return false;
        }
    } else if (period==3) {
        if (15 <= minute && minute <=40) {
            return false;
        } else {
            return true;
        }
    } else if (period==4) {
        if ((0 <= minute && minute <=4) || (30 <= minute && minute <=44)) {
            return false;
        } else {
            return true;
        }
    } else {
        return false;
    }
}

/*
Marks the block of minutes that starts at startMinute in period and is duration minutes long as reserved for an appointment
Preconditions: 1 <= period <= 8; 0 <= startMinute <= 59;
1 <= duration <= 60
*/

public void reserveBlock(int period, int startMinute, int duration) {
    System.out.println("Sieg Heil");
}

 

 

/*
* Searches for the first block of duration free minutes during period, as described in
part (a). Returns the first minute in the block if such a block is found or returns -1 if no
such block is found.
Preconditions: 1 <= period <= 8; 1 <= duration <= 60
*/

public int findFreeBlock(int period, int duration){ 
    int lengthOfBlock = 0;
    for (int i= 1; i <= 60; i++) {
        if (isMinuteFree(period, i)) {
            lengthOfBlock++;
            if (lengthOfBlock==duration) {
                return (i-lengthOfBlock+1);
            }
        } else {
            lengthOfBlock=0;
        }
    }
    return -1;
}
/**
* Searches periods from startPeriod to endPeriod, inclusive, for a block
of duration free minutes, as described in part (b). If such a block is found,
calls reserveBlock to reserve the block of minutes and returns true; otherwise returns false.
Preconditions: 1 <= startPeriod <= endPeriod <= 8; 1 <= duration <= 60
*/

public boolean makeAppointment(int startPeriod, int endPeriod, int duration) {
    for (int i= startPeriod; i <= endPeriod; i++) {
        int freeBlock = findFreeBlock(endPeriod, duration);
        if (freeBlock != -1) {
            reserveBlock(i, freeBlock, duration);
            return true;
        } 
    }
    return false;
  }
}