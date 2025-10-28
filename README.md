# 🔢 Test de Parité et de Signe d'un Nombre

Ce projet est un petit programme Java permettant de déterminer à la fois **la parité** (pair ou impair) et **la positivité** (positif, négatif ou nul) d’un ou plusieurs nombres entiers.

---

## ✨ Fonctionnalités

- Vérifie si un nombre est **pair** ou **impair**.
- Vérifie si un nombre est **positif**, **négatif** ou **nul**.
- Accepte les nombres soit en **arguments de la ligne de commande**, soit via **saisie utilisateur** interactive si aucun argument n’est fourni.
- Peut traiter **plusieurs nombres à la fois** depuis les arguments de la ligne de commande.

---

## 🛠️ Prérequis

- Java 8 ou supérieur installé sur votre machine.
- Un terminal ou un IDE pour compiler et exécuter le programme.

---

## 📦 Compilation

Pour compiler le programme, exécutez la commande suivante dans le terminal à partir du répertoire contenant le fichier `Test.java` :

```bash
javac Test.java
```

---

## 🚀 Exécution

#### 1. Avec saisie utilisateur 🖊️

Si aucun argument n’est fourni, le programme demandera à l’utilisateur d’entrer un nombre entier :

```bash
java Test
```

Exemple de saisie et sortie :

```yaml
Chiffre à tester : 5
5 est positif et impair
```

#### 2. Avec arguments en ligne de commande 💻

Vous pouvez passer un ou plusieurs nombres directement lors de l’exécution :

```bash
java Test 3 -2 0 8
```

Exemple de sortie :

```yaml
3 est positif et impair
-2 est négatif et pair
0 est nul et pair
8 est positif et pair
```

---

## 🧩 Structure du code

Le programme est structuré autour de deux méthodes principales :

- parity(int number) : retourne "pair" si le nombre est pair, sinon "impair".

- positivity(int number) : retourne "positif", "négatif" ou "nul" selon le nombre.

Le programme principal (main) gère l’entrée utilisateur et affiche les résultats pour chaque nombre.
