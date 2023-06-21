import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-assign-more-memory-in-jvm-for-katalon-studio'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-assign-more-memory-in-jvm-for-katalon-studio/36328')

'step 2: Add visual checkpoint at Page_t_how-to-assign-more-memory-in-jvm-for-katalon-studio'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00107_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
