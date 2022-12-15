package net.atos.sample.sbjf.view;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import jakarta.annotation.PostConstruct;
import net.atos.sample.sbjf.entities.NewsEntry;
import net.atos.sample.sbjf.svcs.NewsEntryService;

@Component
@SessionScope
public class NewsEntryController {

	@Autowired
	private NewsEntryService service;
	private List<NewsEntry> news;
	private NewsEntry newEntry;

	@PostConstruct
	public void init() {
		news = service.loadAllNews();
	}

	public List<NewsEntry> getNews() {
		return news;
	}

	public NewsEntry getNewEntry() {
		return newEntry;
	}

	public String add() {
		newEntry = new NewsEntry();
		newEntry.setTimeStamp(LocalDateTime.now());
		return "addForm.xhtml";
	}

	public String save() {
		service.saveEntry(newEntry);
		init();
		return "index.xhtml";
	}

}
