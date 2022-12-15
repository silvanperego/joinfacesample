package net.atos.sample.sbjf.svcs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.atos.sample.sbjf.entities.NewsEntry;
import net.atos.sample.sbjf.repositories.NewsEntryRepository;

@Service
@Transactional
public class NewsEntryService {

	@Autowired
	private NewsEntryRepository newsEntryRepository;

	public List<NewsEntry> loadAllNews() {
		return newsEntryRepository.findAll();
	}

	public void saveEntry(NewsEntry newEntry) {
		newsEntryRepository.save(newEntry);
	}

}
