<template>
    <q-page>
       <div class="row justify-center q-pt-md">
           <div class="col-md-6 col-xs-26">
                <q-card class="my-card">
                <q-card-section>
                    <div class="text-h4 q-pb-md"><center> Input Data Properti </center></div>
                    <q-form
      @submit="onSubmit"
      class="q-gutter-sm"
    >
       <q-input
        filled
        type="text"
        v-model="Tipe"
        label= "Masukkan Tipe "
        lazy-rules
        :rules="[ val => val !== null && val !== '' || 'Wajib disi']"
      />

      <q-input
        filled
        type="text"
        v-model="Ukuran"
        label= "Masukkan Ukuran "
        lazy-rules
        :rules="[ val => val !== null && val !== '' || 'Wajib disi']"
      />

      <q-input
        filled
        type="text"
        v-model="Harga"
        label= "Masukkan Harga "
        lazy-rules
        :rules="[ val => val !== null && val !== '' || 'Wajib disi']"
      />

      <q-input
        filled
        type="text"
        v-model="Fasilitas"
        label= "Masukkan Fasilitas Properti "
        lazy-rules
        :rules="[ val => val !== null && val !== '' || 'Wajib disi']"
      />

      <q-input
        filled
        type="text"
        v-model="Alamat"
        label= "Masukkan Alamat "
        lazy-rules
        :rules="[ val => val !== null && val !== '' || 'Wajib disi']"
      />

      <div>
        <q-btn label="SIMPAN" type="submit" color="primary"/>
      </div>
    </q-form>
                </q-card-section>
                </q-card>
           </div>
       </div>
    </q-page>
</template>

<script>
export default {
  data () {
    return {
      Tipe: '',
      Ukuran: '',
      Harga: '',
      Fasilitas: '',
      Alamat: ''
    }
  },
  methods: {
    onSubmit () {
      this.$axios.post('DataProperti/input', {
        Tipe: this.Tipe,
        Ukuran: this.Ukuran,
        Harga: this.Harga,
        Fasilitas: this.Fasilitas,
        Alamat: this.Alamat
      }).then(res => {
        if (res.data.error) {
          this.showNotif(res.data.pesan, 'negative')
        } else {
          this.$router.push('/home')
        }
        this.Tipe = ''
        this.Ukuran = ''
        this.Harga = ''
        this.Fasilitas = ''
        this.Alamat = ''
      })
    },
    showNotif (msg, color) {
      this.$q.notify({
        message: msg,
        color: 'color'
      })
    }
  }
}
</script>
