package com.example.lembretes.person;

import java.util.List;

import com.example.lembretes.reminder.ReminderModel;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_persons", schema = "public")
public class PersonModel {
  @Id
  @Getter
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String name;
  @OneToMany(mappedBy = "person", fetch = FetchType.LAZY)
  private List<ReminderModel> reminders;
}
