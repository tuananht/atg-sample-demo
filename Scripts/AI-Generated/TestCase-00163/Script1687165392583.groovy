import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_can-i-use-java-programming-language-in-katalon-studio'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/can-i-use-java-programming-language-in-katalon-studio/26057')

'step 2: Add visual checkpoint at Page_t_can-i-use-java-programming-language-in-katalon-studio'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00163_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
