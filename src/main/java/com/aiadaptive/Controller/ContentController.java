package com.aiadaptive.Controller;

import com.aiadaptive.domain.Content;
import com.aiadaptive.services.ContentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("/api/content")
    public class ContentController {

        private final ContentService service;

        public ContentController(ContentService service) {
            this.service = service;
        }

        @GetMapping
        public List<Content> getAll() {
            return service.getAllContent();
        }

        @PostMapping
        public Content create(@RequestBody Content content) {
            return service.createContent(content);
        }

        @PutMapping("/{id}")
        public Content update(@PathVariable String id, @RequestBody Content content) {
            return service.updateContent(id, content);
        }

        @DeleteMapping("/{id}")
        public void delete(@PathVariable String id) {
            service.deleteContent(id);
        }
    }

