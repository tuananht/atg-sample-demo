import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_does-katalon-studio-support-flutter-apps-based-testing-i-tried-to-record-or-spy-not-detected-for-the-object'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/does-katalon-studio-support-flutter-apps-based-testing-i-tried-to-record-or-spy-not-detected-for-the-object/66985')

'step 2: Add visual checkpoint at Page_t_does-katalon-studio-support-flutter-apps-based-testing-i-tried-to-record-or-spy-not-detected-for-the-object'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00921_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
