/** 
 * @author Martín Cardoso
 * @HistoriaClinicaDigitalLaboral
 */
$( ".datepicker" ).datepicker({
	inline: true,
        dateFormat: 'mm/dd/yy',
        changeMonth: true,
        changeYear: true,
        yearRange: '1930:2000'
});

$(document).ready(function(){
    $('#submitPersonaEdit').on('click', function(){
        var str = $('#datepicker').val();
        var fn_correcto = str.split('-').join('/');
        $('#datepicker').val(fn_correcto);
    });
});

$(document).ready(function () {
    $('#parrafo').on('change', function () {
        console.log($('#art2').is(':checked'));
        if ($('#art2').is(':checked')) {
            $('#nombreArt').prop('disabled', true);
        } else {
            $('#nombreArt').prop('disabled', false);
        }
        //console.log('este es el valor: ' + $('#art2:checked').val());
    });
});


