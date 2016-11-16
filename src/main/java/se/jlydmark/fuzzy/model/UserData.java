package se.jlydmark.fuzzy.model;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


@Entity
public class UserData extends AbstractEntityData{
   
   @Column(unique = true, updatable = false)
   private int userId;
   @Column(nullable = false)
   private String username;
   @Column(nullable = false)
   private String firstName;
   @Column(nullable = false)
   private String lastName;
   @OneToMany
   private Collection<MeetingData> meetings;
   @ManyToMany
   private Collection<GroupData> groups;
   
   
   public UserData(int userId, String username, String firstName, String lastName){
      this.userId = userId;
      this.username = username;
      this.firstName = firstName;
      this.lastName = lastName;
      this.meetings = new HashSet();
   }
   
   
   public int getUserId(){
      return this.userId;
   }
   
   
   public String getUsername(){
      return this.username;
   }
   
   
   public String getFirstName(){
      return this.firstName;
   }
   
   
   public String getLastName(){
      return this.lastName;
   }
   
   
   public Collection<MeetingData> getMeetings(){
      return this.meetings;
   }
   
   
   public Collection<GroupData> getGroups(){
      return this.groups;
   }
}
