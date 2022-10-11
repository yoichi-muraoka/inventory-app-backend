# 概要
- [備品管理システム](https://github.com/yoichi-muraoka/inventory-app-frontend)(React)のバックエンド

## 使用技術
- Spring Boot
  - MyBatis + MyBatisGenerator
  - Flyway
- MySQL

## アプリケーションの起動
アプリケーションの起動に際しては、あらかじめMySQLサーバー上に「inventory_app_db」を作成しておく<br>
⇒ Flywayによって、必要なテーブルが生成され、初期データが投入される

## エンドポイント
- URLのベースは「localhost:8080/api」
- 備品の追加・更新時には、`{id: 備品ID, name: 備品名, amount: 数量, place: {id: 保管場所ID, name: 保管場所名}, note: 備考, registeredAt: 登録日}`を受け取る

| URL | メソッド | 説明 |
|-----|---------|------|
| /items      | GET    | 以下のパラメータを受け、備品のリストを返す<br>_page: ページ番号。初期値は「1」<br> _limit: 取得する備品の件数。初期値は「5」 |
| /items      | POST   | 備品を追加する |
| /items/{id} | PUT    | 備品情報を更新する |
| /items/{id} | DELETE | 備品を削除する |
| /places/    | GET    | 備品保管場所のリストを返す |
