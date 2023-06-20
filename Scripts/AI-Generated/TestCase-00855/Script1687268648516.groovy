import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_java-lang-noclassdeffounderror-javax-annotation-postconstruct'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/java-lang-noclassdeffounderror-javax-annotation-postconstruct/38226')

'step 2: Add visual checkpoint at Page_t_java-lang-noclassdeffounderror-javax-annotation-postconstruct'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00855_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
