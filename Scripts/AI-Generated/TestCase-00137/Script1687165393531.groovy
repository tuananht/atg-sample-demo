import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_excluding-specific-classes-out-of-the-plugin-jar'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/excluding-specific-classes-out-of-the-plugin-jar/21049')

'step 2: Add visual checkpoint at Page_t_excluding-specific-classes-out-of-the-plugin-jar'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00137_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
