import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_katalon-properties-file-and-jvm-system-property-katalon-user-home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/katalon-properties-file-and-jvm-system-property-katalon-user-home/9943')

'step 2: Add visual checkpoint at Page_t_katalon-properties-file-and-jvm-system-property-katalon-user-home'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00836_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
