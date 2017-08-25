/*
 * Knetik.io Data Collector REST API
 * <p>Use this API to send application data to Knetik.io including user/device information and transactional events.</p> <p>   Please consult the <a href=\"/doc\">official user documentation</a> to find out how to send data, and how this data is used. <p></p> <h2>Notes</h2> <br> New more ReSTful implementation of the telemetry data collection service. Legacy clients can still use the old API format, but we strongly recommend switching over to this new format. Navigate to the legacy documentation using the dropdown at the top of this page. <p></p> <h2>User IDs and Device IDs</h2> <br> Knetik.io can uniquely associate state, events and transactions to users and/or devices for your application. In order to accomplish this, each API call takes userId and deviceId as parameters in the request object. At least one of these must be provided in the request object, except as explicitly noted. <br> <p></p> <h2>Timestamps</h2> <br> All timestamp parameters must be epoch timestamps in milliseconds. <br> <p></p> <h2>Required Request Headers</h2> <br> The following HTTP header values must be provided for each API call: <ul>   <li>     <b>Content-Type: application/json</b>   </li> </ul> <p></p> <h2>Required Query Parameters</h2> <br> All API calls also require the following query parameters to be present on the URL: <ul>   <li>     <b>customer_id:</b> your unique customer ID   </li> </ul> <p></p> <h2>API Responses</h2> <br> If successful, API calls will simply return an HTTP response code of ACCEPTED (202) with no other data. If errors occur, a JSON payload will be returned containing detailed error information and an appropriate HTTP error status code will be provided (as documented in each of the API methods). <br> <p></p>
 *
 * OpenAPI spec version: 2.0
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.knetik.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.Streams;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.format.DateTimeFormatter;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import io.knetik.model.*;

public class JSON {
    private Gson gson;
    private DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();

    public JSON() {
    
    	// register polymorphic type adapters
    
        gson = new GsonBuilder()
            .registerTypeAdapter(Date.class, dateTypeAdapter)
            .registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter)
            .registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter)
            .registerTypeAdapter(LocalDate.class, localDateTypeAdapter)
            .create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     * @return JSON
     */
    public JSON setGson(Gson gson) {
        this.gson = gson;
        return this;
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public JSON setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
        return this;
    }

    public JSON setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
        return this;
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {
        }

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {
        }

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public JSON setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
        return this;
    }

    public JSON setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
        return this;
    }

	/**
	 * Adapts values whose runtime type may differ from their declaration type. This
	 * is necessary when a field's type is not the same type that GSON should create
	 * when deserializing that field. For example, consider these types:
	 * <pre>   {@code
	 *   abstract class Shape {
	 *     int x;
	 *     int y;
	 *   }
	 *   class Circle extends Shape {
	 *     int radius;
	 *   }
	 *   class Rectangle extends Shape {
	 *     int width;
	 *     int height;
	 *   }
	 *   class Diamond extends Shape {
	 *     int width;
	 *     int height;
	 *   }
	 *   class Drawing {
	 *     Shape bottomShape;
	 *     Shape topShape;
	 *   }
	 * }</pre>
	 * <p>Without additional type information, the serialized JSON is ambiguous. Is
	 * the bottom shape in this drawing a rectangle or a diamond? <pre>   {@code
	 *   {
	 *     "bottomShape": {
	 *       "width": 10,
	 *       "height": 5,
	 *       "x": 0,
	 *       "y": 0
	 *     },
	 *     "topShape": {
	 *       "radius": 2,
	 *       "x": 4,
	 *       "y": 1
	 *     }
	 *   }}</pre>
	 * This class addresses this problem by adding type information to the
	 * serialized JSON and honoring that type information when the JSON is
	 * deserialized: <pre>   {@code
	 *   {
	 *     "bottomShape": {
	 *       "type": "Diamond",
	 *       "width": 10,
	 *       "height": 5,
	 *       "x": 0,
	 *       "y": 0
	 *     },
	 *     "topShape": {
	 *       "type": "Circle",
	 *       "radius": 2,
	 *       "x": 4,
	 *       "y": 1
	 *     }
	 *   }}</pre>
	 * Both the type field name ({@code "type"}) and the type labels ({@code
	 * "Rectangle"}) are configurable.
	 *
	 * <h3>Registering Types</h3>
	 * Create a {@code RuntimeTypeAdapterFactory} by passing the base type and type field
	 * name to the {@link #of} factory method. If you don't supply an explicit type
	 * field name, {@code "type"} will be used. <pre>   {@code
	 *   RuntimeTypeAdapterFactory<Shape> shapeAdapterFactory
	 *       = RuntimeTypeAdapterFactory.of(Shape.class, "type");
	 * }</pre>
	 * Next register all of your subtypes. Every subtype must be explicitly
	 * registered. This protects your application from injection attacks. If you
	 * don't supply an explicit type label, the type's simple name will be used.
	 * <pre>   {@code
	 *   shapeAdapter.registerSubtype(Rectangle.class, "Rectangle");
	 *   shapeAdapter.registerSubtype(Circle.class, "Circle");
	 *   shapeAdapter.registerSubtype(Diamond.class, "Diamond");
	 * }</pre>
	 * Finally, register the type adapter factory in your application's GSON builder:
	 * <pre>   {@code
	 *   Gson gson = new GsonBuilder()
	 *       .registerTypeAdapterFactory(shapeAdapterFactory)
	 *       .create();
	 * }</pre>
	 * Like {@code GsonBuilder}, this API supports chaining: <pre>   {@code
	 *   RuntimeTypeAdapterFactory<Shape> shapeAdapterFactory = RuntimeTypeAdapterFactory.of(Shape.class)
	 *       .registerSubtype(Rectangle.class)
	 *       .registerSubtype(Circle.class)
	 *       .registerSubtype(Diamond.class);
	 * }</pre>
	 */
	private static final class RuntimeTypeAdapterFactory<T> implements TypeAdapterFactory {
	  private final Class<?> baseType;
	  private final String typeFieldName;
	  private final Map<String, Class<?>> labelToSubtype = new LinkedHashMap<String, Class<?>>();
	  private final Map<Class<?>, String> subtypeToLabel = new LinkedHashMap<Class<?>, String>();
	
	  private RuntimeTypeAdapterFactory(Class<?> baseType, String typeFieldName) {
	    if (typeFieldName == null || baseType == null) {
	      throw new NullPointerException();
	    }
	    this.baseType = baseType;
	    this.typeFieldName = typeFieldName;
	  }
	
	  /**
	   * Creates a new runtime type adapter using for {@code baseType} using {@code
	   * typeFieldName} as the type field name. Type field names are case sensitive.
	   */
	  public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> baseType, String typeFieldName) {
	    return new RuntimeTypeAdapterFactory<T>(baseType, typeFieldName);
	  }
	
	  /**
	   * Creates a new runtime type adapter for {@code baseType} using {@code "type"} as
	   * the type field name.
	   */
	  public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> baseType) {
	    return new RuntimeTypeAdapterFactory<T>(baseType, "type");
	  }
	
	  /**
	   * Registers {@code type} identified by {@code label}. Labels are case
	   * sensitive.
	   *
	   * @throws IllegalArgumentException if either {@code type} or {@code label}
	   *     have already been registered on this type adapter.
	   */
	  public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> type, String label) {
	    if (type == null || label == null) {
	      throw new NullPointerException();
	    }
	    if (subtypeToLabel.containsKey(type) || labelToSubtype.containsKey(label)) {
	      throw new IllegalArgumentException("types and labels must be unique");
	    }
	    labelToSubtype.put(label, type);
	    subtypeToLabel.put(type, label);
	    return this;
	  }
	
	  /**
	   * Registers {@code type} identified by its {@link Class#getSimpleName simple
	   * name}. Labels are case sensitive.
	   *
	   * @throws IllegalArgumentException if either {@code type} or its simple name
	   *     have already been registered on this type adapter.
	   */
	  public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> type) {
	    return registerSubtype(type, type.getSimpleName());
	  }
	
	  public <R> TypeAdapter<R> create(Gson gson, TypeToken<R> type) {
	    if (null == type || !baseType.isAssignableFrom(type.getRawType())) {
	      return null;
	    }
	
	    final Map<String, TypeAdapter<?>> labelToDelegate
	        = new LinkedHashMap<String, TypeAdapter<?>>();
	    final Map<Class<?>, TypeAdapter<?>> subtypeToDelegate
	        = new LinkedHashMap<Class<?>, TypeAdapter<?>>();
	    for (Map.Entry<String, Class<?>> entry : labelToSubtype.entrySet()) {
	      TypeAdapter<?> delegate = gson.getDelegateAdapter(this, TypeToken.get(entry.getValue()));
	      labelToDelegate.put(entry.getKey(), delegate);
	      subtypeToDelegate.put(entry.getValue(), delegate);
	    }
	
	    return new TypeAdapter<R>() {
	      @Override public R read(JsonReader in) throws IOException {
	        JsonElement jsonElement = Streams.parse(in);
	        JsonElement labelJsonElement = jsonElement.getAsJsonObject().get(typeFieldName);
	        if (labelJsonElement == null) {
	          throw new JsonParseException("cannot deserialize " + baseType
	              + " because it does not define a field named " + typeFieldName);
	        }
	        String label = labelJsonElement.getAsString();
	        @SuppressWarnings("unchecked") // registration requires that subtype extends T
	        TypeAdapter<R> delegate = (TypeAdapter<R>) labelToDelegate.get(label);
	        if (delegate == null) {
	          throw new JsonParseException("cannot deserialize " + baseType + " subtype named "
	              + label + "; did you forget to register a subtype?");
	        }
	        return delegate.fromJsonTree(jsonElement);
	      }
	
	      @Override public void write(JsonWriter out, R value) throws IOException {
	        Class<?> srcType = value.getClass();
	        String label = subtypeToLabel.get(srcType);
	        @SuppressWarnings("unchecked") // registration requires that subtype extends T
	        TypeAdapter<R> delegate = (TypeAdapter<R>) subtypeToDelegate.get(srcType);
	        if (delegate == null) {
	          throw new JsonParseException("cannot serialize " + srcType.getName()
	              + "; did you forget to register a subtype?");
	        }
	        JsonObject jsonObject = delegate.toJsonTree(value).getAsJsonObject();
	        JsonObject clone = new JsonObject();
	        for (Map.Entry<String, JsonElement> e : jsonObject.entrySet()) {
	          clone.add(e.getKey(), e.getValue());
	        }
	        clone.add(typeFieldName, new JsonPrimitive(label));
	        Streams.write(clone, out);
	      }
	    }.nullSafe();
	  }
	}
}
