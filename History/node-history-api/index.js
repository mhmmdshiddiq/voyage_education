const express = require('express');
const bodyParser = require('body-parser');

const app = express();
const port = 3000;

app.use(bodyParser.json());

let history = [];

// Endpoint untuk mendapatkan seluruh histori
app.get('/history', (req, res) => {
  res.json(history);
});

// Endpoint untuk membuat catatan histori baru
app.post('/history', (req, res) => {
  const newEntry = req.body;
  history.push(newEntry);
  res.json(newEntry);
});

// Endpoint untuk menghapus seluruh histori
app.delete('/history', (req, res) => {
  history = [];
  res.json({ message: 'Histori berhasil dihapus.' });
});

app.listen(port, () => {
  console.log(`Server berjalan di http://localhost:${port}`);
});
