import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_java-lang-nullpointerexception-cannot-invoke-method-getat-on-null-6'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/java-lang-nullpointerexception-cannot-invoke-method-getat-on-null-object/20650/6')

'step 2: Add visual checkpoint at Page_t_java-lang-nullpointerexception-cannot-invoke-method-getat-on-null-6'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01296_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
