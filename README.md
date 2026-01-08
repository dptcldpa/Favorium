# 💾 Favorium

> 사용자가 원하는 카테고리를 직접 만들고 기록할 수 있는 맞춤형 기록 플랫폼

<br>

### 🗂️ 프로젝트 소개
- 제한된 카테고리에서 벗어나 사용자가 직접 원하는 카테고리를 생성해, 자유롭게 각 항목에 맞는 글을 작성할 수 있는 웹 서비스입니다.
- 주제별로 게시글을 체계적으로 관리할 수 있어, 개인의 다양한 관심사를 한 곳에서 편하게 정리할 수 있습니다.

<br>

### 📅 작업 기간
2024.12 - 2025.01

<br>

### 🧑‍💻 개발 인원
1명 (개인 프로젝트)

<br>

## ✨ 서비스 주요 기능

### 1. 회원가입 / 로그인

| 회원가입 | 로그인 |
|:---:|:---:|
| <img width="300" height="433" alt="Signup" src="https://github.com/user-attachments/assets/5750ac94-584e-471c-8ccd-d35425f11990" /> | <img width="300" height="433" alt="Signin" src="https://github.com/user-attachments/assets/9280f5e7-38f4-410e-a98e-649fafb22007" /> |
| 입력값 실시간 검증과 아이디 중복 체크, 이메일 형식 검사를 통해 잘못된 정보로 회원가입이 되지 않음 | 아이디 기반 사용자 조회 후 인증에 성공하면 세션에 정보를 저장하여 로그인 상태를 유지하도록 구현 |

### 2. 카테고리 추가

| <img width="400" height="398" alt="add-category" src="https://github.com/user-attachments/assets/d2f814cf-37a5-4b61-a880-e5867871db89" /> |
|:---:|
| 사용자 세션 정보를 기반으로 사용자별 카테고리를 생성하여 개인 맞춤형 구조로 관리 |

### 3. 글 작성

| <img width="400" height="494" alt="post" src="https://github.com/user-attachments/assets/8cf3f52b-1837-4b50-9cc5-52a44bb67181" /> | <img width="800" height="494" alt="post-screenshot" src="https://github.com/user-attachments/assets/fa839f34-97c8-4ab7-b391-287799331be7" /> |
|:---:|:---:|
| 카테고리를 선택하고 이미지를 업로드하며, 날짜를 지정해 게시글을 작성할 수 있음  | 게시글은 카테고리와 연동되어 관리 |

### 4. 달력 연동

| <img width="400" height="600" alt="calander" src="https://github.com/user-attachments/assets/c998a622-9dd3-48c5-a57d-55e331d6a540" /> |
|:---:|
| 연·월 이동 시 해당 날짜에 맞는 달력이 출력되도록 하였으며, 해당 날짜에 업로드한 이미지 표시 |

### 5. 1년 게시글 알림

| <img width="300" height="748" alt="alarm" src="https://github.com/user-attachments/assets/3a477eba-0947-438b-ab03-6dbd973e1f7b" /> |
|:---:|
| 게시글 작성 후 1년이 지난 시점에 로그인하면, 1년 전 작성한 게시글이 자동으로 모달창에 표시됨 |

<br>

## 🛠 기술 스택

| 영역 | 기술 |
| :-: | :-: |
| **프론트엔드** | ![HTML5](https://img.shields.io/badge/-HTML5-E34F26?style=flat-square&logo=html5&logoColor=white) ![CSS](https://img.shields.io/badge/-CSS-663399?style=flat-square&logo=CSS&logoColor=white) ![Bootstrap](https://img.shields.io/badge/-Bootstrap-7952B3?style=flat-square&logo=Bootstrap&logoColor=white) ![Thymeleaf](https://img.shields.io/badge/-Thymeleaf-005F0F?style=flat-square&logo=Thymeleaf&logoColor=white) ![Javascript](https://img.shields.io/badge/-Javascript-F7DF1E?style=flat-square&logo=Javascript&logoColor=white) |
| **백엔드**  | ![Java](https://img.shields.io/badge/-Java-007396?style=flat-square&logo=Java&logoColor=white) ![Spring Boot](https://img.shields.io/badge/-SpringBoot-6DB33F?style=flat-square&logo=SpringBoot&logoColor=white) |
| **Database**  | ![MySQL](https://img.shields.io/badge/-MySQL-4479A1?style=flat-square&logo=MySQL&logoColor=white) |
| **인프라** | ![AWS EC2](https://img.shields.io/badge/-AWS%20EC2-232F3E?style=flat-square&logo=Amazon%20AWS&logoColor=white) |
| **UI/UX** | ![Figma](https://img.shields.io/badge/-Figma-F24E1E?style=flat-square&logo=Figma&logoColor=white) |

<br>

## 🔄 ERD 설계

<img width="1000" height="569" alt="erd" src="https://github.com/user-attachments/assets/ab910f00-ddf0-4d09-9605-4bf027913865" />

<br>

## 🗂 시스템 아키텍쳐 구성도

<img width="1000" height="678" alt="project-flow" src="https://github.com/user-attachments/assets/a70fab12-02d3-4a3c-a417-9864587822e4" />

<br>

## 🎯 백엔드 API
<img width="1000" height="678" alt="backend-api" src="https://github.com/user-attachments/assets/8974b401-bf0d-47e4-8717-dd4fea76a43a" />

