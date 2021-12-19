    $(".OK").on("click", function() {
        var currentRow = $(this).closest("tr");
        var id = currentRow.find("td:eq(0)").attr("value");
        var ten = currentRow.find("td:eq(3)").html();
        var gia = currentRow.find("td:eq(4)").html();
        var tien = gia * 1;
        var tongtien = 0;
        var index = $(".addrow").find("tr").length;


        var ma = "<input readOnly class='form-control-plaintext'  name='monanOrder["+index+"].monanid' value=' "+ id +"'>" ;
        var xoa = "<button type='button' class='delete' id='delete"+id+"'>Xóa</button>"
            var row = "<tr><td style='width:20%;' >" +
                ma
                + "</td>" +
                "<td>" + ten + "</td>" +
                "<td>" +
                "<input class='form-control' "+
                "id = '"+ id +
                "'name='monanOrder["+index+"].soluong'"+
                "min = '1'" +
                "max = '10'"+
                "type = 'number'"+
                "pattern = '/^[0-9]$'"+
                "required "+
                "value = '1' >"+
                "</td>" +
                "<td>" + tien + "</td>" +
                "<td>" + xoa + "</td>"+
                "</tr>";
            $(".addrow").append(row);
            $(".addrow").find("tr").each((k)=> {
                var dongia = $(this).find("td:eq(3)").html() * 1;
                var s = $(this).find("td:eq(3)").attr("value") *1;
                var x = dongia;
                tongtien = tongtien + x;
            })
            $("#tongtien").html(tongtien);
    });
