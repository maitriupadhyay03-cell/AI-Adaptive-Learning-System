package com.aiadaptive.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Recommendation {
        private String id;
        private String userId;
        private String contentId;
        private int matchScore; // 0–100

        public Recommendation() {}
        public Recommendation(String id, String userId, String contentId, int matchScore) {
            this.id = id; this.userId = userId; this.contentId = contentId; this.matchScore = matchScore;
        }

}
