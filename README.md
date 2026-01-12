# Java- 学習リポジトリ

Javaの学習を目的で作って成長へ繋げるためのリポジトリです。
様々なアプリケーションを作成してJavaの基礎から応用まで学習します。

## 📚 プロジェクト一覧

このリポジトリには以下のJava学習アプリケーションが含まれています：

### 1. Hello World (`src/helloworld/`)
- **目的**: Javaの基本構文を学ぶ
- **内容**: シンプルな "Hello, World!" プログラム
- **学習ポイント**: 
  - クラスの作成
  - main メソッド
  - System.out.println の使い方

### 2. 電卓 (`src/calculator/`)
- **目的**: 基本的な演算とユーザー入力処理を学ぶ
- **内容**: 四則演算ができる電卓アプリケーション
- **学習ポイント**:
  - Scanner クラスによる入力処理
  - switch 文による条件分岐
  - メソッドの作成と呼び出し
  - エラーハンドリング（0での割り算チェック）

### 3. ToDoリスト (`src/todolist/`)
- **目的**: データ構造とオブジェクト指向を学ぶ
- **内容**: タスク管理ができるToDoリストアプリケーション
- **学習ポイント**:
  - ArrayList の使い方
  - クラスの設計とオブジェクト指向
  - whileループとメニュー駆動プログラム
  - CRUDオペレーション（作成・読取・更新・削除）

## 🚀 実行方法

### 前提条件
- Java Development Kit (JDK) 8 以降がインストールされていること
- コマンドラインまたはターミナルへのアクセス

### コンパイルと実行

#### 1. Hello World の実行
```bash
# コンパイル
javac src/helloworld/HelloWorld.java

# 実行
java -cp src helloworld.HelloWorld
```

#### 2. 電卓の実行
```bash
# コンパイル
javac src/calculator/Calculator.java

# 実行
java -cp src calculator.Calculator
```

#### 3. ToDoリストの実行
```bash
# コンパイル
javac src/todolist/TodoList.java

# 実行
java -cp src todolist.TodoList
```

## 📖 学習の進め方

1. **Hello World** から始めて、Javaの基本構文に慣れる
2. **電卓** でユーザー入力と条件分岐を学ぶ
3. **ToDoリスト** でデータ構造とオブジェクト指向プログラミングを学ぶ

各プログラムのソースコードを読み、理解してから実行してみましょう。
コードを改変して、新しい機能を追加することで理解を深めることができます。

## 🎯 今後の拡張予定

- ファイル入出力を使ったアプリケーション
- データベース連携アプリケーション
- GUIを使ったアプリケーション
- Webアプリケーション

## 📝 ライセンス

このプロジェクトは学習目的で作成されています。自由に使用・改変してください。
