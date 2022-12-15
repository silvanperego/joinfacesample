package net.atos.sample.sbjf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.atos.sample.sbjf.entities.NewsEntry;

public interface NewsEntryRepository extends JpaRepository<NewsEntry, Integer> {

}
