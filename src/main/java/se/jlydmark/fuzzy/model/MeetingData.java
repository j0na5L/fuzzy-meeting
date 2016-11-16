package se.jlydmark.fuzzy.model;

import java.util.Collection;


public class MeetingData{
   
   private float timeStart;
   private float timeEnd;
   private boolean meetingCompleted;
   private Collection<UserData> users;
   
   
   public MeetingData(float timeStart, float timeEnd){
      this.timeStart = timeStart;
      this.timeEnd = timeEnd;
      this.meetingCompleted = false;
   }
   
   
   public float getTimeStart(){
      return this.timeStart;
   }
   
   
   public float getTimeEnd(){
      return this.timeEnd;
   }
   
   
   public boolean getMeetingCompleted(){
      return this.meetingCompleted;
   }
   
   
   public Collection<UserData> getUsers(){
      return this.users;
   }
   
}
