import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_the-groovy-java-utils-thread'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/the-groovy-java-utils-thread/19920')

'step 2: Add visual checkpoint at Page_t_the-groovy-java-utils-thread'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00122_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
